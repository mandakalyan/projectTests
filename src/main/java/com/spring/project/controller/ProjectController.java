package com.spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.Project;
import com.spring.project.entity.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	@PostMapping("/addproject/")
	public Project addProject(@RequestBody Project project ) {
		service.addProject(project);
		return project;
		
	}
	
	@GetMapping("/getall")
	public List<Project> getAllProjects(){
		return service.getAllProjects();
		
	}
	@GetMapping("/get/{projectId}")
	public List<Project> getProjectById(@PathVariable String projectId){
		return service.getProjectById(projectId);
	}
	@PutMapping("/update")
	public Project updateProject(@RequestBody Project project) {
		service.updateProject(project);
		return project;
	}
	
	public String deleteProjectById(@PathVariable String projectId ) {
		service.deleteProjectById(projectId);
		return "project deleted succesfully";
	}

}
