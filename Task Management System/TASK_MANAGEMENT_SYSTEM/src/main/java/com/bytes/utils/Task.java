package com.bytes.utils;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Task")
public class Task {
	@Id
	private int taskID;
	private String title;
	private String description;
	private LocalDate dueDate;
	private int priority;
	private String status;
	@ManyToOne
	@JoinColumn(name="userID")
//	@JsonIdentityReference(alwaysAsId = true)
	private User userID;
	@ManyToOne
	@JoinColumn(name="workID")
	private Work workID;
	
	public Task() {
		
	}
	
	public Task(int taskID, String title, String description, int priority, String status, User userID,LocalDate dueDate,
			Work workID) {
		super();
		this.taskID = taskID;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.userID = userID;
		this.dueDate=dueDate;
		this.workID = workID;
	}

	
	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public Work getWorkID() {
		return workID;
	}

	public void setWorkID(Work workID) {
		this.workID = workID;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	
}
