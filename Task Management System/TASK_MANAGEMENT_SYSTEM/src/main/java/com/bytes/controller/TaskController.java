package com.bytes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.TaskServiceImpl;
import com.bytes.service.UserServiceImpl;
import com.bytes.utils.Task;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/taskmain")
public class TaskController {

	@Autowired
	private TaskServiceImpl taskService;
	private UserServiceImpl userService;

//	create task	
	@PostMapping("/task")
	public String addtaskDetails(@RequestBody Task task) {
		taskService.addtaskDetails(task);

		return "details added";
	}

	// view tasks
	@GetMapping("/viewTask")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	// delete tasks
	@DeleteMapping("/deleteTask/{taskId}")
	public ResponseEntity<String> deleteTask(@PathVariable int taskId) {
		taskService.deleteTask(taskId);
		return ResponseEntity.ok("Task deleted successfully");
	}

	//	update status	  

	@PutMapping("/status/{taskID}")
	public Task updateTaskStatus(@PathVariable int taskID, @RequestBody Task task) {
		return taskService.updateTaskStatus(taskID, task);
	}
}
