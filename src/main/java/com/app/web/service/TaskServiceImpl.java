package com.app.web.service;

import com.app.web.entity.Task;
import com.app.web.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService  {
	
	@Autowired
	private TaskRepository repository;
	
	@Override
	public List<Task> listAllTask(){
		
		return repository.findAll();
		
	}

	@Override
	public Task createTask(Task task) {
		
		return repository.save(task);
	}

	@Override
	public List<Task> filterStatus(String status) {
		List<Task> all = repository.findAll();
		List<Task> filter = new ArrayList<>();
		
		for (int i = 0; i < all.size();i++) {
			if (all.get(i).getStatus().equals(status)) {
				filter.add(all.get(i));
			}
		}
		
		return filter;
	}

	@Override
	public Task UpdateStatus(Task task, Long id) {
		Task task1 = repository.findById(id).get();
		task1.setStatus(task.getStatus());
		Task updatedTask = repository.save(task1);
		
		return updatedTask;
	}

	@Override
	public String deleteTask(Long id) {
		
		repository.deleteById(id);
		
		return "Deleted";
	}

	
	
	


}
