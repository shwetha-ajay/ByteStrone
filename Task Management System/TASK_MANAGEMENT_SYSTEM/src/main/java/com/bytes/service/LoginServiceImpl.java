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
		System.out.println(login.getEmail() );
		System.out.println(login.getPassword() );

		
		if (login.getEmail() == "shwethaknr@gmail.com" && login.getPassword() == "admin123") {
			Login adminLogin = new Login();
			adminLogin.setRoleName("superadmin");
			return ResponseEntity.ok(adminLogin);

		} else {
			Login details = loginRepository.findByEmail(login.getEmail());
			if (details.getEmail().equals(login.getEmail()) && details.getPassword().equals(login.getPassword())) {
				String role = details.getRoleName();
				if (role.equals("admin") || role.equals("user")) {
					return ResponseEntity.ok(details);
				}
			}

			return ResponseEntity.ok(details);

//		System.out.println("errorr");
//				return ResponseEntity.internalServerError().build();
//	}
		}
	}
}
