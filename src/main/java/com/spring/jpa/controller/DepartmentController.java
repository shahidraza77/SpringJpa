package com.spring.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Department;
import com.spring.jpa.model.Student;
import com.spring.jpa.repository.DepartmentRepository;
import com.spring.jpa.service.DepartmentService;

import java.util.*;


@RestController
@CrossOrigin(origins = "*")

public class DepartmentController {
	
	@Autowired
	private DepartmentService dptservice;
	@Autowired
	private DepartmentRepository dtprepo;
	@PostMapping("/adddepartment")
	public Department addDeparment(@RequestBody Department dpt)
	{
		//Student s=new Student();
		//s.setName(dpt.getStudent().setName(null))
		//Student s=dpt.getStudent();
		
		
		//s.setName(s.getName());
		System.out.print(dpt.getStudent().getName());
		return dptservice.saveDepartment(dpt);
		
	}
	@GetMapping("/getdepartment/{id}")
	public Optional<Department> getDepartment(@PathVariable(value = "id") Integer id)
	{
		
		return dptservice.getDepartment(id);
		//return "hi";
		
	}
	
	@GetMapping("/getdepartments")
	public List<Department> getDeparments()
	{
		 List<Department>ll=  dtprepo.findAll();
		 System.out.println(ll.size());
		 return ll;
		
		//return dptservice.getDepartments();
		//return "hi";
		
	}

}
