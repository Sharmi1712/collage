package com.example.collage.rest.service;

import java.util.List;

import com.example.collage.rest.model.Student;

public interface IStudentService {

	public Student get(long id);
	
	public List<Student> getAll();
	
	public String delete(long id);
	
	public Student update(Student student);
	
}
