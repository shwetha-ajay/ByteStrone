package com.bytes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;

import com.bytes.utils.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "INSERT INTO user (userId, password,roleId.roleId,name,email) VALUES (:userId, :password,:roleId,:name,:email)", nativeQuery = true)
	void AddAdmin(@RequestBody int userId,@RequestBody String password,@RequestBody int roleId,@RequestBody String name,@RequestBody String email);

	//Object deleteById();

}
