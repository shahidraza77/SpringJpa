package com.spring.jpa.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
          
          // List<Department> findById(Integer id);
//	       @Override
//	    default List<Department> findAllById(Iterable<Integer> ids) {
//	    	// TODO Auto-generated method stub
//	    	return null;
//	    }
}
