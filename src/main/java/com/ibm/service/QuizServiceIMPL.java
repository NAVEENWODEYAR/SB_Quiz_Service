package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Quiz;
import com.ibm.repo.QuizRepo;

@Service
public class QuizServiceIMPL implements QuizService
{
	@Autowired
	private QuizRepo quizRepo;
//	private QuizRepo quizRepo;
	
	@Override
	public Quiz add(Quiz quiz)
	{
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> get() 
	{
		return quizRepo.findAll();
	}

	@Override
	public Quiz get(Long qId) 
	{
		return quizRepo.findById(qId).get();
	}

}
