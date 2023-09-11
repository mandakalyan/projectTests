package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.Project;
import com.spring.project.entity.Worker;
import com.spring.project.entity.service.WorkerService;
import com.spring.project.request.WorkerRequest;

@RestController
@RequestMapping("/api")
public class WorkerController {
	@Autowired
	private WorkerService workerServ;
	
	@PostMapping("/addworker/")
	public Worker createWorker(@RequestBody WorkerRequest workerReq, @RequestParam String workerType) {
		
		Project project = new Project();
		project.setProjectId(workerReq.getProjectId());
		project.setProjectName(workerReq.getProjectName());
		return workerServ.createWorker(workerReq.getWorkerId(),workerReq.getWorkerName(), project, workerType);
		
		
	}

}
