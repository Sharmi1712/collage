package com.example.collage.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.collage.rest.model.Student;
import com.example.collage.rest.service.IStudentService;


@RestController
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("/student/{id}")
	@ResponseBody
	public ResponseEntity<Student> getStudent(@PathVariable long id) {
		Student student = service.get(id);
		ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.OK);
		return response;
	}	

	@PostMapping("/student/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		student = service.update(student);
		ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.OK);
		return response;
	}	
	
	@GetMapping("/student/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable long id) {
		String message = service.delete(id);
		ResponseEntity<String> response = new ResponseEntity<>(message, HttpStatus.OK);
		return response;
		
	}	
	
	
	
	
}