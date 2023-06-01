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
	private User assignedTo;
	@ManyToOne
	@JoinColumn(name="workID")
	private Work workID;
	
	public Task() {
		
	}
	
	public Task(int taskID, String title, String description, int priority, String status, User assignedTo,
			Work workID) {
		super();
		this.taskID = taskID;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.assignedTo = assignedTo;
		this.workID = workID;
	}

	/**
	 * @return the taskID
	 */
	public int getTaskID() {
		return taskID;
	}

	/**
	 * @param taskID the taskID to set
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the assignedTo
	 */
	public User getAssignedTo() {
		return assignedTo;
	}

	/**
	 * @param assignedTo the assignedTo to set
	 */
	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}

	/**
	 * @return the workID
	 */
	public Work getWorkID() {
		return workID;
	}

	/**
	 * @param workID the workID to set
	 */
	public void setWorkID(Work workID) {
		this.workID = workID;
	}

	

}
