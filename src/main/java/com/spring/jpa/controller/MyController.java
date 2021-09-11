package com.spring.jpa.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Department;
import com.spring.jpa.model.Student;
import com.spring.jpa.service.StudentService;

@RestController
@CrossOrigin(origins = "*")
public class MyController {

	@Autowired
	private StudentService stservice;
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student std)
	{
		
		return stservice.saveStudent(std);
		
	}
	
	@GetMapping("/getstudent/{id}")
	public Optional<Student> getStudent(@PathVariable(value = "id") Integer id)
	{
		
		return stservice.getStudent(id);
		//return "hi";
		
	}
	@GetMapping("/getstudents")
	public List<Student> getStudents()
	{
		
		return stservice.getStudents();
		//return "hi";
		
	}

}
