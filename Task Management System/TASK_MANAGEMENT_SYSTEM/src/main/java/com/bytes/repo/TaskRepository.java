package com.bytes.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytes.utils.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	
//	 List<Task> findByUserId(int userID);
	// List<Task> findByAssignedToUserId(int userId);

//	@Query("SELECT t FROM Task t ")
//    List<Task> findAllTasks();

//	Task findById(String taskId);
	
	//    List<Task> findByUserId(int userID);

	
	}


