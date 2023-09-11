package com.spring.project.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Id;

@Document(collection="projects")
 public class Project {
	@Id
	private String projectId;
    private String projectName;
    @Field("workers")
    @DBRef
    private List<Worker> workers;


	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}


	public Project(String projectId, String projectName, List<Worker> workers) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.workers = workers;
	}

	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public List<Worker> getWorkers() {
		return workers;
	}


	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
