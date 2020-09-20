package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public void addProject(Project project);
	public void deleteProject(long id);
	public Optional<Project> getProjectbyId(long id);
	public void updateProject(long id);
	public	void searchbyid(long id);
	public  List<Project> getProjects();
	
	
}
