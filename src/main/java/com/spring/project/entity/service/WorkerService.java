package com.spring.project.entity.service;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.Contractor;
import com.spring.project.entity.Employee;
import com.spring.project.entity.Project;
import com.spring.project.entity.Worker;
import com.spring.project.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
    private WorkerRepository workerRepo;
	
	
	public Worker createWorker(String workerId,String workerName,Project project,String workerType ) {
      Worker worker;
      if("Employee".equals(workerType)) {
    	  Employee employee =new Employee();
    	  employee.setWorkerId(workerId);
    	  employee.setWorkerName(workerName);
    	  employee.setEmployeeName(workerName);
    	  employee.setProject(project);
    	  worker=employee;
      }
      else if("Contractor".equals(workerType)) {
    	  Contractor contractor = new Contractor();
    	  contractor.setWorkerId(workerId);
    	  contractor.setWorkerName(workerName);
    	  contractor.setContractorName(workerName);
    	  contractor.setProject(project);
    	  worker= contractor;
      }
		
      else {
    	  throw new IllegalArgumentException(workerType);
      }
		return workerRepo.save(worker);
		
	}
    
    

}
