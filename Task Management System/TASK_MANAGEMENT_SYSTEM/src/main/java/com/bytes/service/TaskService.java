package com.bytes.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bytes.utils.Task;

public interface TaskService {

	public void addtaskDetails(Task task);
	
	public List<Task> getAllTasks();

	public void deleteTask(int taskId);



//	   public void updateTaskStatus(String taskId, String status);

//	public void updateTaskStatus(int taskID, Task task);
     
//	Task updateTaskStatus(int taskID, Task task);
	Task updateTaskPriority(int taskID, Task task);
     
//	List<Task> getTasksByUserId(int userId);
	Task getTaskById(int taskId);
	ResponseEntity<Task> getTaskByUserId(int userId);


//    List<Task> getTasksByUserId(int userID);
   
}
