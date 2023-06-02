package com.bytes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytes.repo.LoginRepository;
import com.bytes.utils.Login;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepository;

	@Override
//	public void addLoginDetails(Login login) {
//		LoginRepository.save(login);

	public ResponseEntity<Login> loginDetails(Login login) {
		Login details = loginRepository.findByEmail(login.getEmail(),login.getPassword());
		if (details.getEmail().equals(login.getEmail()) && details.getPassword().equals((login.getPassword()))) {
			return ResponseEntity.ok(details);
		}
		return (ResponseEntity<Login>) ResponseEntity.internalServerError();

	}
 
}
