package com.spring.Project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.spring.project.entity.Project;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProjectZApplicationTests {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;

	
	
	@Test
	public void testAddProject() {
	    Project projectToAdd = new Project("a12", "project5", null);

	    ResponseEntity<Project> responseEntity = restTemplate.postForEntity(
	            "/addproject/", projectToAdd, Project.class);

	    assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    Project addedProject = responseEntity.getBody();
	    assertNotNull(addedProject);
	}

	@Test
	public void testGetAllProjects() {
	    ResponseEntity<List> responseEntity = restTemplate.getForEntity(
	            "/getall", List.class);

	    assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    List<Project> projects = responseEntity.getBody();
	    assertNotNull(projects);
	}

	@Test
	public void testGetProjectById() {
	   
	    ResponseEntity<List> responseEntity = restTemplate.getForEntity(
	            "/get/ka1", List.class, "projectId");

	    assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    List<Project> projects = responseEntity.getBody();
	    assertNotNull(projects);
	   
	}

	
	@Test
	public void testDeleteProjectById() {
	    
	    ResponseEntity<String> responseEntity = restTemplate.exchange(
	            "/delete/ka1", HttpMethod.DELETE,
	            null, String.class, "projectId");

	    assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    String responseMessage = responseEntity.getBody();
	    assertNotNull(responseMessage);
	    assertEquals("project deleted successfully", responseMessage);
	}



}
