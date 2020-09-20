package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;

@Service
public  class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	

	@Override
	public void addProject(Project project) {
		projectRepository.save(project);


	}

	@Override
	public void deleteProject(long id) {
		projectRepository.deleteById(id);
		
	}


	@Override
	public void updateProject(long id) {
		
		
	}

	@Override
	public void searchbyid(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public Optional<Project> getProjectbyId(long id) {
		return projectRepository.findById(id);
		
	}



}
