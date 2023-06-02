package com.bytes.utils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Work")
public class Work {
	@Id
	private int workID;
	private String title;
	private String description;
	
	public Work() {
		
	}
	
	public Work(int workID, String title, String description) {
		super();
		this.workID = workID;
		this.title = title;
		this.description = description;
	}

	/**
	 * @return the workID
	 */
	public int getWorkID() {
		return workID;
	}

	/**
	 * @param workID the workID to set
	 */
	public void setWorkID(int workID) {
		this.workID = workID;
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
	

}
