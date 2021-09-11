package com.spring.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
   public Optional<Question> findById(Integer id);
   
   public Question findByQuestion(String question);
}
