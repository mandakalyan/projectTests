package com.spring.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.entity.Project;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {

	List<Project> findByProjectId(String projectId);


	void deleteByProjectId(String projectId);



	

}
