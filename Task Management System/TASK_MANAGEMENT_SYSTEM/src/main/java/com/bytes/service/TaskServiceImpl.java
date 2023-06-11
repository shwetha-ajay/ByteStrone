package com.bytes.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.bytes.repo.TaskRepository;
import com.bytes.utils.ReturnTasksWithScore;
import com.bytes.utils.Task;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

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
		Task taskFromTable = taskRepository.findById(taskId).orElse(null);
		if (taskFromTable != null) {
			taskFromTable.setStatus(status);
			return taskRepository.save(taskFromTable);
		} else {
			throw new EntityNotFoundException("Task not found with ID: " + taskId);
		}
	}

	
//  update priority of task	
	@Override
	public Task updateTaskPriority(int taskID, Task task) {
		Task existingPriority = taskRepository.findById(taskID).orElse(null);
		if (existingPriority != null) {
			existingPriority.setPriority(task.getPriority());
			return taskRepository.save(existingPriority);
		} else {
			throw new EntityNotFoundException("Task not found with ID: " + taskID);
		}
	}

	
//   search by taskid
	@Override
	public Task getTaskById(int taskId) {
		java.util.Optional<Task> optionalTask = taskRepository.findById(taskId);
		return optionalTask.orElse(null);
	}

	
//   fetch task by userid		  
	@Override
	public ResponseEntity<Task> getTaskByUserId(int userId) {
		List<Task> tasklist = taskRepository.findAll();
		for (Task task : tasklist) {
			if (task.getUserID().getUserID() == userId) {
				return ResponseEntity.ok(task);
			}
		}
		return ResponseEntity.notFound().build();
	}

	
//  priority calculation
	private static final double WEIGHTAGE_DUE_DATE = 0.3;
	// private static final double WEIGHTAGE_PRIORITY = 0.1;
	private static final double WEIGHTAGE_STATUS = 0.7;

	@Override
	public List<ReturnTasksWithScore> calculatePriorityScore(List<Task> task) {
		List<ReturnTasksWithScore> tasks = new ArrayList<ReturnTasksWithScore>();
		int i = 0;
		for (Task task1 : task) {

			double normalizedDueDate = calculateNormalizedDueDate(task1.getDueDate());

			double normalizedStatus = calculateNormalizedStatus(task1.getStatus());

			// Calculate the priority score
			double priorityScore = (normalizedDueDate * WEIGHTAGE_DUE_DATE) + (normalizedStatus * WEIGHTAGE_STATUS);

			ReturnTasksWithScore scored123 = new ReturnTasksWithScore(task1.getTaskID(), task1.getTitle(),
					task1.getDescription(), task1.getDueDate(), task1.getPriority(), task1.getStatus(), priorityScore,
					task1.getUserID().getUserID(), task1.getWorkID().getWorkID());

			tasks.add(scored123);

		}
		return tasks;

	}

	// Define a method to calculate the normalized due date
	private double calculateNormalizedDueDate(LocalDate dueDate) {
		LocalDate today = LocalDate.now();
		long remainingDays = ChronoUnit.DAYS.between(today, dueDate);
		double totalDays = ChronoUnit.DAYS.between(today, dueDate.plusDays(1)); // Adding 1 to include the due date
																				// itself

		// Normalize the due date within the range of 0 to 1
		double normalizedDueDate = Math.max(0, Math.min(remainingDays / totalDays, 1));

		return normalizedDueDate;
	}

	// Define a method to calculate the normalized status
	private double calculateNormalizedStatus(String status) {
		if (status.equalsIgnoreCase("Completed")) {
			return 0;
		} else {
			return 1;
		}

	}
}
