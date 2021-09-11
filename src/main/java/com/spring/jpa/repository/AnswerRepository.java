package com.spring.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.jpa.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
	@Query(value = "SELECT * FROM answer WHERE ques_id = ?1", nativeQuery = true)
	  List<Answer> findByques_Id(Integer id);

}
