package com.bytes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bytes.main.TaskManagementSystemApplication;
import com.bytes.repo.UserRepository;
import com.bytes.utils.Task;
import com.bytes.utils.User;
import com.bytes.utils.UserRole;

@SpringBootTest(classes = TaskManagementSystemApplication.class)
public class UserServiceImplTests {
	@MockBean
	UserRepository userRepository;

	@Autowired
	UserService userService;

	@Test
	void getAllUsers() {

		int userID = 4001;
		String name = "ram";
		String email = "ram22@gmail.com";
		UserRole roleID = new UserRole(101, "Admin");

		User user = new User(userID, name, email, roleID);

		Mockito.when(userRepository.findAll()).thenReturn(Arrays.asList(user));
		assertEquals(1, userService.getAllUsers().size());
	}
	


}
