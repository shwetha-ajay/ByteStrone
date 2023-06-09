package com.bytes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytes.utils.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	@Query(value = "INSERT INTO user (userId, password,roleId.roleId,name,email) VALUES (:userId, :password,:roleId,:name,:email)", nativeQuery = true)
//	void AddAdmin(@RequestBody int userId,@RequestBody String password,@RequestBody int roleId,@RequestBody String name,@RequestBody String email);

	User findByEmail(String email);
	 

}
