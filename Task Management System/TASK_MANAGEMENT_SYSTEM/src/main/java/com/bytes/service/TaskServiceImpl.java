package com.bytes.service;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Map;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytes.repo.TaskRepository;
import com.bytes.utils.Task;
import com.bytes.utils.User;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	 private TaskRepository taskRepository;
	//UserService userService;

	@Override
	public void addtaskDetails(Task tasks) {
	//  User currentUser = userService.getCurrentUser();
	  //      if (currentUser.getRoleID() == 101) {
		taskRepository.save(tasks);
	 //       } else {
	//            throw new AccessDeniedException("Only users with admin role can add tasks.");
	//        }
	}

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();

	}
	
	@Override
	public void deleteTask(int taskId) {
		taskRepository.deleteById(taskId);
	}
	
	public Task updateTaskStatus(Object task) {
		System.out.println(task);
//		taskService.addtaskDetails(task);
		  Map<String, Object> taskMap = (Map<String, Object>) task;
	    int taskId = (int) taskMap.get("taskId");
	    String status = (String) taskMap.get("status");
	//    Task tusk = new Task();
        Task taskFromTable = taskRepository.findById(taskId).orElse(null);
	    if (taskFromTable!=null) {
	        taskFromTable.setStatus(status);
	        return taskRepository.save(taskFromTable);
	        
	        // Perform any other operations with the taskFromTable object
	    } else {
	        // Handle the case when the task is not found
	    	throw new EntityNotFoundException("Task not found with ID: " +taskId);
	    }
	    
	//    System.out.println(taskId);
	}

//	
//	@Override
//	public Task updateTaskStatus(int taskID, Task task) {
//		Task existingStatus = taskRepository.findById(taskID).orElse(null);
//		if (existingStatus != null) {
//			existingStatus.setStatus(task.getStatus());
//			return taskRepository.save(existingStatus);
//		} else {
//			throw new EntityNotFoundException("Task not found with ID: " + taskID);
//
//		}
//	}
	@Override
	public Task updateTaskPriority(int taskID, Task task) {
		Task existingPriority = taskRepository.findById(taskID).orElse(null);
		if (existingPriority != null) {
			existingPriority.setPriority(task.getPriority());
			return taskRepository.save(existingPriority);
		} else {
			throw new EntityNotFoundException("Task not found with ID: " + taskID);

		}}
//		  @Override
//		    public List<Task> getTasksByUserId(int userId) {
//		        return taskRepository.findByAssignedToUserId(userId);
//		    }	
	//search by taskid
		  @Override
		    public Task getTaskById(int taskId) {
		        java.util.Optional<Task> optionalTask = taskRepository.findById(taskId);
		        return optionalTask.orElse(null);
		    
	}
//		    public List<Task> getTasksByUserId(int userID) {
//				  return taskRepository.findByUserId(userID);
//			}
		//search by userid
//		  @Override
//		    public Task getTaskByUserId(int userId) {
//		        java.util.Optional<Task> optionalTask = taskRepository.findById(userId);
//		        return optionalTask.orElse(null);
//		    
//	}
		  
		  @Override
		 public ResponseEntity<Task> getTaskByUserId(int userId){
			  List<Task> tasklist=taskRepository.findAll();
				for(Task task:tasklist){
					if (task.getUserID().getUserID()==userId) {
						return ResponseEntity.ok(task);
					}
					
				}	return ResponseEntity.notFound().build();
		  }

	
}
