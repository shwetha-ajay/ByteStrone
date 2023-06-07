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
	@Override
	public void deleteTask(int taskId) {
		taskRepository.deleteById(taskId);
	}

	
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
	@Override
	public Task updateTaskPriority(int taskID, Task task) {
		Task existingPriority = taskRepository.findById(taskID).orElse(null);
		if (existingPriority != null) {
			existingPriority.setPriority(task.getPriority());
			return taskRepository.save(existingPriority);
		} else {
			throw new EntityNotFoundException("Task not found with ID: " + taskID);

		}
//		  @Override
//		    public List<Task> getTasksByUserId(int userId) {
//		        return taskRepository.findByAssignedToUserId(userId);
//		    }	
	}
}
