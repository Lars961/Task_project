package com.app.web.service;


import com.app.web.entity.Task;
import java.util.List;

public interface TaskService {
	
	public List<Task> listAllTask();
	
	public Task createTask(Task task);
	
	public List<Task> filterStatus(String status);
		
	public Task UpdateStatus(Task task, Long id);
	
	public String deleteTask(Long id);

	
}
