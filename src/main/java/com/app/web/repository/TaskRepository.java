package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Task;
	
@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {
	
	}

