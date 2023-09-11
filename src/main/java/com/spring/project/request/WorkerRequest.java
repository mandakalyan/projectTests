package com.spring.project.request;

public class WorkerRequest {
	
	private String WorkerId;
	
	private String WorkerName;
	
	private String projectId;
	
	private String projectName;
	
	private String projectDescription;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getWorkerId() {
		return WorkerId;
	}

	public void setWorkerId(String workerId) {
		WorkerId = workerId;
	}

	public String getWorkerName() {
		return WorkerName;
	}

	public void setWorkerName(String workerName) {
		WorkerName = workerName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	

}
