package com.bytes.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bytes.utils.ReturnTasksWithScore;
import com.bytes.utils.Task;

public interface TaskService {

	public void addtaskDetails(Task task);

	public List<Task> getAllTasks();

	public void deleteTask(int taskId);

	Task updateTaskPriority(int taskID, Task task);

	Task getTaskById(int taskId);

	ResponseEntity<Task> getTaskByUserId(int userId);

	List<ReturnTasksWithScore> calculatePriorityScore(List<Task> task);

}
