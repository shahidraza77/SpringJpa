package com.spring.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Answer;
import com.spring.jpa.service.AnswerService;

@RestController
@CrossOrigin(origins = "*")
public class AnswerController {
	@Autowired 
	private AnswerService answerService; 
	@GetMapping("/getanswer/{id}")
    public Optional<Answer> getAnswer(@PathVariable(value = "id") Integer id)
    {
    	return answerService.getAnswer(id);
    }
	@GetMapping("/getanswerbyquestionid/{id}")
    public List<Answer> getAnswerByQuestionId(@PathVariable(value = "id") Integer id)
    {
    	return answerService.getAnswerByQueId(id);
    }

	@GetMapping("/getanswers")
    public List<Answer>getAllAnswer()
    {
    	return answerService.getAnswers();
    }

}
