package com.spring.project.entity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.Project;
import com.spring.project.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepo;
	
	public void addProject(Project project) {
	
		projectRepo.save(project);
		}

	
	public List<Project> getAllProjects(){
		List<Project> projects= new ArrayList<>();
		projectRepo.findAll().forEach(projects1 -> projects.add(projects1));
		return projects;
	}
	
	public List<Project> getProjectById(String projectId){
		 List<Project> projects = projectRepo.findByProjectId(projectId);
		 return projects;
	}
	
	public Project updateProject(Project project) {
		projectRepo.save(project);
		return project;
	}
	
	public void deleteProjectById(String projectId) {
		projectRepo.deleteByProjectId(projectId);
	}




	
	

}
