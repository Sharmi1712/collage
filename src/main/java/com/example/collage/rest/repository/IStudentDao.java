package com.example.collage.rest.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.example.collage.rest.model.Student;

@Repository
public class IStudentDao extends SimpleJpaRepository<Student, Long>{

	public IStudentDao(EntityManager em) {
		super(Student.class, em);
		
	}

	

	
	
}