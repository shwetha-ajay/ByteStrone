package com.bytes.service;


import java.util.List;

import com.bytes.utils.Task;

public interface TaskService {
	
	public void addtaskDetails(Task task);
	// public  List<Task> getAllTasks(Task task) ;

	public List<Task> getAllTasks();

	   public void deleteTask(int taskId);  
	   
//	   public void updateTaskStatus(String taskId, String status);

}
