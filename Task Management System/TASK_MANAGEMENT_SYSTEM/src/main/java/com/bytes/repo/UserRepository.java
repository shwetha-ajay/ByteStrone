package com.bytes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytes.utils.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
