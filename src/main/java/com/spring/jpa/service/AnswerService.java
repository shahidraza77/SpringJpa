package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.model.Answer;
import com.spring.jpa.model.Question;
import com.spring.jpa.repository.AnswerRepository;

@Service
public class AnswerService {
	
  @Autowired
  private AnswerRepository answerRepository;

public Optional<Answer> getAnswer(Integer id) {
	// TODO Auto-generated method stub
	return answerRepository.findById(id);
}
public List<Answer> getAnswers() {
	// TODO Auto-generated method stub
	return answerRepository.findAll();
}
public List<Answer> getAnswerByQueId(Integer id) {
	// TODO Auto-generated method stub
	return answerRepository.findByques_Id(id);
} 
}
