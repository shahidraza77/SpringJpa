package com.spring.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Question;
import com.spring.jpa.service.QuestionService;

@RestController
@CrossOrigin(origins = "*")
public class QuestionController {
	 @Autowired
	 private QuestionService questionService;
	@PostMapping("/addquestion")
	public Question addQuestion(@RequestBody Question q)
	{
		return  questionService.saveQuestion(q);
	}
    @GetMapping("/getquestion/{id}")
    public Optional<Question> getQuestion(@PathVariable(value = "id") Integer id)
    {
    	return questionService.getQuestionById(id);
    }
    @GetMapping("/getquestions")
    public List<Question> getQuestions()
    {
    	return questionService.getQuestions();
    }
    @GetMapping("/getquestionbyname/{question}")
    public Question getQuestion(@PathVariable(value = "question") String question)
    {
    	return questionService.getQuestionByName(question);
    }
}
