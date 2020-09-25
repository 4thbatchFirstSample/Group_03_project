package com.spring.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ProjectConverter;
import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Project;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value = "api/v1")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@PostMapping(value = "/project")
	public ResponseEntity<Object> addEmployee(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/project")
	public List<ProjectDto> getProjects() {
		return (ProjectConverter.projectToProjectDto(projectService.getProjects()));
	}

	@DeleteMapping(value = "/project/{id}")
	public String getEmployeeDetails(@PathVariable Long id) {
			projectService.deleteProject(id);
		return "Successfully Deleted";
	}

	@GetMapping(value = "/project/{id}")
	public ResponseEntity<Object> getbyId(@PathVariable long id) {
		if(projectService.isIdExists(id)) {	
			return new ResponseEntity<Object>(projectService.getProjectbyId(id), HttpStatus.CREATED);
		}
		return new ResponseEntity<Object>("No Id", HttpStatus.BAD_REQUEST);
	}

	@PutMapping(value = "/project")
	public ResponseEntity<Object> addEmployee1(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("update Successfully", HttpStatus.CREATED);
	}
}
