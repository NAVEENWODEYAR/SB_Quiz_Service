package com.ibm.service;

import java.util.List;

import com.ibm.entity.Quiz;

public interface QuizService 
{
	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long qId);
}
