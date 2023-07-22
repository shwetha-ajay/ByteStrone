package com.bytes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bytes.main.TaskManagementSystemApplication;
import com.bytes.repo.TaskRepository;
import com.bytes.utils.Task;
import com.bytes.utils.User;
import com.bytes.utils.Work;

@SpringBootTest(classes = TaskManagementSystemApplication.class)
public class TaskServiceImplTests {

	@MockBean
	TaskRepository taskRepository;

	@Autowired
	TaskService taskService;

	@Test
	void getAllTasks() {

		int taskID = 1;
		String title = "Sample Task";
		String description = "This is a sample task description.";
		int priority = 1;
		String status = "In Progress";
		User userID = new User(4001, "Ram", status, null);
		LocalDate dueDate = LocalDate.of(2023, 8, 24);
		Work workID = new Work(8000, "Sample Work", status);
		double score = 0.0;

		Task task = new Task(taskID, title, description, priority, status, userID, dueDate, workID, score);

		Mockito.when(taskRepository.findAll()).thenReturn(Arrays.asList(task, task));
		assertEquals(2, taskService.getAllTasks().size());
	}

	@Test
	void getTasksByUserId() {
		int userId = 123;
		List<Task> dummyTasks = new ArrayList<>();

		dummyTasks.add(new Task());
//		     dummyTasks.add(new Task(2, "Task 2", "Description 2"));

		Mockito.when(taskRepository.findByUserID_UserID(userId)).thenReturn(dummyTasks);
		List<Task> result = taskService.getTasksByUserId(userId);

		Mockito.verify(taskRepository).findByUserID_UserID(userId);

		assertEquals(dummyTasks, result);

	}

	@Test
	public void deleteTaskById() {
		int taskId = 123;

		// Call the deleteTask method
		taskService.deleteTask(taskId);

		// Verify that the deleteById method of the mocked repository is called with the
		// correct taskId
		Mockito.verify(taskRepository).deleteById(taskId);
	}
}

//	void addtaskDetails(Task tasks) {
//		int taskID=123;
//	    String title= "Design product";
//		 String description= "Ideas on designing product";
//		 LocalDate dueDate=LocalDate.parse("2023-06-09");
//		 int priority=3;
//		 String status="Completed";
//		 User userID=4004;	
//		 Work workID=8000;
//		 
//		 taskService.addtaskDetails(tasks );
//	     Mockito.verify(taskService).addtaskDetails(tasks);

//		
//		
//		Task task = new Task();
//        task.setTitle("Design product");
//        task.setDescription("Ideas on designing product");
//        task.setDueDate(LocalDate.parse("2023-06-09"));
//        task.setPriority(3);
//        task.setStatus("Completed");
//  //    task.setUserID(4004);
//  //    task.setWorkID(8000);
//        taskService.addtaskDetails(task);
//
//        // Verify the method call
//        verify(taskRepository).save(task);
