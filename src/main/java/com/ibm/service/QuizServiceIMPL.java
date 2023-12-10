package com.ibm.service;

import java.util.List;
import java.util.stream.Collectors;

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
	
	@Autowired
	private QuestionClient questionClient;
	
	@Override
	public Quiz add(Quiz quiz)
	{
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> get() 
	{
		List<Quiz> quizzes = quizRepo.findAll();
		List<Quiz> newQuizList = quizzes.stream().map(	
														quiz-> {quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getQId()));
														return quiz;
		}).collect(Collectors.toList());
		
		return quizzes;
	}

	@Override
	public Quiz get(Long qId) 
	{
		Quiz quiz = quizRepo.findById(qId).orElseThrow(()-> new RuntimeException("Not Found"));
			quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getQId()));
		return quiz;
	}

}
