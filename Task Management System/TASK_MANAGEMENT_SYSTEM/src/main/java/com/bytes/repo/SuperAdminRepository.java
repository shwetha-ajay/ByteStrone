package com.bytes.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytes.utils.User;

public interface SuperAdminRepository extends JpaRepository<User, Integer> { 
//    Optional<UserRole> findById(Integer roleID);

}
