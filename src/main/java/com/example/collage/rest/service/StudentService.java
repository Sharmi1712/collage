package com.example.collage.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collage.rest.model.Student;
import com.example.collage.rest.repository.IStudentDao;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private IStudentDao studentDao;
	
	
	@Override
	public Student get(long id) {
		Optional<Student> student = studentDao.findById(id);
		return student.isPresent() ? student.get() : null;
	}

	@Override
	public String delete(long id) {
		studentDao.deleteById(id);
		return "Student Deleted";
	}

	@Override
	public Student update(Student student) {
		return studentDao.save(student);
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}