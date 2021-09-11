package com.spring.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	//Optional<Student> findById(Integer id);

}
