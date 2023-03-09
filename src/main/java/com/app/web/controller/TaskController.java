package com.app.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.web.entity.Task;
import com.app.web.service.TaskServiceImpl;

@RestController

public class TaskController {
	
	
	@Autowired
	private TaskServiceImpl service;
	
	@GetMapping("/hola")
	public String x(){
		return "hola";
		
	}
	
	@GetMapping("/tasks")
	public List<Task> ListTasks() {
		//model.addAttribute("tasks", service.listAllTask());
		
		return service.listAllTask();
	}
	
	@PostMapping("/tasks/new")
	public Task createTask(@RequestBody Task task) {
		return service.createTask(task);
		//model.addAttribute("task", task);
		
		
	}
	
	@GetMapping("/tasks/late")
	public List<Task> filterTasksLate(/*Model model*/) {
		//model.addAttribute("tasks", service.listAllTask());
		
		return service.filterStatus("LATE");
	}
	
	@GetMapping("/tasks/complete")
	public List<Task> filterTasksComplete(/*Model model*/) {
		//model.addAttribute("tasks", service.listAllTask());
		
		return service.filterStatus("COMPLETE");
	}
	
	@GetMapping("/tasks/not_complete")
	public List<Task> filterTasksNotComplete(/*Model model*/) {
		//model.addAttribute("tasks", service.listAllTask());
		
		return service.filterStatus("NOT COMPLETE");
	}
	
	@PutMapping
	public ResponseEntity<Task> updateTask(@RequestBody Task task, @PathVariable(name = "id")long id){
		Task taskResponse = service.UpdateStatus(task, id);
		return new ResponseEntity<>(taskResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable(name = "id")long id){
		service.deleteTask(id);
		return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
	}
	
	
}
