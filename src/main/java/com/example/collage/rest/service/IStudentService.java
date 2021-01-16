package com.example.collage.rest.service;

import com.example.collage.rest.model.Student;

public interface IStudentService {

	public Student get(long id);
	
	public String delete(long id);
	
	public Student update(Student student);
	
}