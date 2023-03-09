package com.app.web.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "title", nullable = false,length = 60)
	private String title;
	
	@Column (name = "description", nullable = false,length = 60)
	private String description;
	
	@Column (name = "Estimated_completion_date", nullable = false,length = 60)
	private String completionDate;
	
	@Column (name = "Status", nullable = false,length = 60)
	private String status;
	
	@Column (name = "Completed", nullable = false,length = 60)
	private String completed;
	
	
	//Constructor
	public Task() {}
	
	public Task(String title, String description, String completionDate, String completed, String status) {
		super();
		this.title = title;
		this.description = description;
		this.completionDate = completionDate;
		this.status = status;
		this.completed = completed;
	}


	
	//Get y Set
	public Long getId() {
		return id;
	}


	/*public void setId(Long id) {
		id = id;
	}*/


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


	public String getCompletionDate() {
		return completionDate;
	}


	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getCompleted() {
		return completed;
	}


	public void setCompleted(String completed) {
		this.completed = completed;
	}
	
	@Override
	public String toString() {
		return "task [id=" + id + ", title=" + title + ", description=" + description + ", completionDate=" + completionDate + ", status=" + status+ "]";
	}
	

	

}
