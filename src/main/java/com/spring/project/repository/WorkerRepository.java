package com.spring.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.project.entity.Worker;

public interface WorkerRepository extends MongoRepository<Worker, String> {

}
