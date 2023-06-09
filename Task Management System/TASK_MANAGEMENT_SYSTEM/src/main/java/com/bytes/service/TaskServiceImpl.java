package com.bytes.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.bytes.repo.TaskRepository;
import com.bytes.utils.Task;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	//UserService userService;

//  add task
	@Override
	public void addtaskDetails(Task tasks) {
		taskRepository.save(tasks);
	}

//  list all tasks	
	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}
	
//  delete task by taskid	
	@Override
	public void deleteTask(int taskId) {
		taskRepository.deleteById(taskId);
	}
	
//  update status of task	
	public Task updateTaskStatus(Object task) {
		System.out.println(task);
		Map<String, Object> taskMap = (Map<String, Object>) task;
	    int taskId = (int) taskMap.get("taskId");
	    String status = (String) taskMap.get("status");
	//    Task tusk = new Task();
        Task taskFromTable = taskRepository.findById(taskId).orElse(null);
	    if (taskFromTable!=null) {
	        taskFromTable.setStatus(status);
	        return taskRepository.save(taskFromTable);
	    }
	    else {
	    	throw new EntityNotFoundException("Task not found with ID: " +taskId);
	    }
	}

	
//	@Override
//	public Task updateTaskStatus(int taskID, Task task) {
//		Task existingStatus = taskRepository.findById(taskID).orElse(null);
//		if (existingStatus != null) {
//			existingStatus.setStatus(task.getStatus());
//			return taskRepository.save(existingStatus);
//		} 
//	    else {
//			throw new EntityNotFoundException("Task not found with ID: " + taskID);
//		}
//	}
	
//  update priority of task	
	@Override
	public Task updateTaskPriority(int taskID, Task task) {
		Task existingPriority = taskRepository.findById(taskID).orElse(null);
		if (existingPriority != null) {
			existingPriority.setPriority(task.getPriority());
			return taskRepository.save(existingPriority);
		} else {
			throw new EntityNotFoundException("Task not found with ID: " + taskID);
		}}
	

//   search by taskid
	 @Override
	 public Task getTaskById(int taskId) {
		 java.util.Optional<Task> optionalTask = taskRepository.findById(taskId);
		 return optionalTask.orElse(null);	    
	}

		//search by userid
//		  @Override
//		    public Task getTaskByUserId(int userId) {
//		        java.util.Optional<Task> optionalTask = taskRepository.findById(userId);
//		        return optionalTask.orElse(null);
//		    
//	}
//    fetch task by userid		  
	  @Override
	  public ResponseEntity<Task> getTaskByUserId(int userId){
		 List<Task> tasklist=taskRepository.findAll();
		 for(Task task:tasklist){
			 if (task.getUserID().getUserID()==userId) {
				 return ResponseEntity.ok(task);
			 }					
			 }	 return ResponseEntity.notFound().build();
		  }

}
