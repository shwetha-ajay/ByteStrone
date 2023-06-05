package com.bytes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.TaskRepository;
import com.bytes.utils.Task;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
    TaskRepository taskRepository;

//	@Override
//	public void addtaskDetails(Task tasks) {
//		taskRepository.save(tasks);
//	}
	@Override
	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	
	}
	
    public void deleteTask(int taskId) {
        taskRepository.deleteById(taskId);
    }
	
	}
