package com.bytes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytes.utils.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{
	
//	@Query("SELECT t FROM Task t ")
//    List<Task> findAllTasks();
      
//	Task findById(String taskId);
      

}
      

