package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.model.Department;
import com.spring.jpa.model.Student;
import com.spring.jpa.repository.DepartmentRepository;
import com.spring.jpa.repository.StudentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepo;
	@Autowired
	private StudentRepository studentRepo;

	public Department saveDepartment(Department dpt) {
		//dpt.getStudent().setDepartment(dpt);
		//dpt.getStudent().
		Department d=new Department();
		d.setName(dpt.getName());
		Student s=new Student();
		s.setName(dpt.getStudent().getName());
		//studentRepo.save(s);
		return departmentRepo.save(dpt);
	}


	public Optional<Department> getDepartment(Integer id) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(id);
	}


	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}

}
