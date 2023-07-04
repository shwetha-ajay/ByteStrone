package com.bytes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytes.utils.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	   List<Task> findByUserID_UserID(int userID);
}


