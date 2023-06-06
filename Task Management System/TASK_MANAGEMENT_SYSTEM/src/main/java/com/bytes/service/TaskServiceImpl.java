package com.bytes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.TaskRepository;
import com.bytes.utils.Task;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	 private TaskRepository taskRepository;

	@Override
	public void addtaskDetails(Task tasks) {
		taskRepository.save(tasks);
	}

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();

	}

	public void deleteTask(int taskId) {
		taskRepository.deleteById(taskId);
	}

	// updatestatus
//    public Task updateTaskStatus(Long taskId, String newStatus, User user) {
//        Task task = getTaskById(taskId);
//        if (userService.hasPermission(user, task)) {
//            task.setStatus(newStatus);
//            return taskRepository.save(task);
//        } else {
//            throw new AccessDeniedException("You don't have permission to update the status of this task");
//        }
//    }
	// @Override
//    public Task updateTaskStatus(int taskID, String status) {
//        Task task = taskRepository.findById(taskID);
//        if (task == null) {
//            throw new EntityNotFoundException("Task not found with ID: " + taskID);
//        }
//        task.setStatus(status);
//        taskRepository.save(task);
//        return task;
//    }
//    @Override
//    public void updateTaskStatus(int taskID,Task task) {
//    	Task currentStatus=taskRepository.findById(taskID);
//    	currentStatus.setStatus(task.getStatus());
//    	taskRepository.save(currentStatus);
//    	
//    }
	@Override
	public Task updateTaskStatus(int taskID, Task task) {
		Task existingStatus = taskRepository.findById(taskID).orElse(null);
		if (existingStatus != null) {
			existingStatus.setStatus(task.getStatus());
			return taskRepository.save(existingStatus);
		} else {
			throw new EntityNotFoundException("Task not found with ID: " + taskID);

		}
	}
}
