package com.bytes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.LoginRepository;
import com.bytes.utils.Login;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
    LoginRepository loginRepository;
	
	@Override
	public void addLoginDetails(Login login) {
		// TODO Auto-generated method stub
		loginRepository.save(login);

	}

}
	