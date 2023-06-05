package com.bytes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytes.repo.LoginRepository;
import com.bytes.utils.Login;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepository;

//	@Override
//	public void addLoginDetails(Login login) {
//		LoginRepository.save(login);

	public ResponseEntity<Login> loginDetails(Login login) {
		System.out.println("checkk");
		Login details = loginRepository.findByEmail(login.getEmail());
		
//		if (details.getEmail().equals(login.getEmail())) {
			return ResponseEntity.ok(details);
//		}
//		System.out.println("errorr");
//				return ResponseEntity.internalServerError().build();
//		
//		List<Login> loglist =loginRepository.findAll();
//		for(Login log:loglist) {
//			if (log.getEmail().equals(login.getEmail())&&log.getPassword().equals(login.getPassword())){
//				return ResponseEntity.ok(log);
//			}
//			
//		}
//		return ResponseEntity.internalServerError().build();

	}
 
}
