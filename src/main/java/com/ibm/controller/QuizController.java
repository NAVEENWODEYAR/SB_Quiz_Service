package com.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Quiz;
import com.ibm.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController 
{

	@Autowired
	private QuizService quizService;
//	private QuizService quizService;
	
	@GetMapping("/getQuiz")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Quiz> getQuiz()
	{
		return quizService.get();
	}
	
	@GetMapping("/id/{}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Quiz getQuiz(@PathVariable Long qId)
	{
		return quizService.get(qId);
	}
	
	@PostMapping("/postQuiz")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Quiz postQuiz(@RequestBody Quiz quiz)
	{
		return quizService.add(quiz);
	}
	
	
}
