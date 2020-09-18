package com.spring.boot.services;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public void addProject(Project project);
	public void deleteProject(Long id);
	public void getProject(Long id);
	public void updateProject(Long id);
	
}
