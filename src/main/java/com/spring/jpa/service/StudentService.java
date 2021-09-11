package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.model.Student;
import com.spring.jpa.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;
	
	public Student saveStudent(Student s)
	{
		  return studentRepo.save(s);
	}

	public Optional<Student> getStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	public List<Student> getStudents() {
		
		return studentRepo.findAll();
	}

}
