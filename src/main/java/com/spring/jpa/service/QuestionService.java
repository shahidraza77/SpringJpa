package com.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.spring.jpa.model.Answer;
import com.spring.jpa.model.Question;
import com.spring.jpa.repository.AnswerRepository;
import com.spring.jpa.repository.QuestionRepository;
@Service
public class QuestionService {
    @Autowired 
   private QuestionRepository questionRepository;
    @Autowired 
  private  AnswerRepository answerRepository; 
	public Question saveQuestion(Question q) {
		List<Answer> l=new ArrayList<Answer>();
		for(Answer a: q.getAnswer())
		{
			a.setQuestion(q);
			l.add(a);
		}
		 answerRepository.saveAll(l);
		return questionRepository.save(q);
	}
	public Optional<Question> getQuestionById(Integer id) {
		// TODO Auto-generated method stub
		
		return questionRepository.findById(id);
	}
	public Question getQuestionByName(String question) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuestion(question);
	}
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

}
