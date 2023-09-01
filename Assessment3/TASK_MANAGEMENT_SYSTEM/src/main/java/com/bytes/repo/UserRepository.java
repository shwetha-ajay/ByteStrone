package com.bytes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bytes.utils.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//	 User findByEmailAndPasswordAndRoleid(String email, String password, int roleId);
	    
	User findByEmail(String email);
	
	@Query("SELECT u.userID FROM User u")
    List<Integer> findAllUserIds();

	
}
