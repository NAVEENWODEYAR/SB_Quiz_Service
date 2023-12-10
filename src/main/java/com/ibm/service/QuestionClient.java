package com.ibm.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.entity.Question;

@FeignClient(url = "http://localhost:8522",value = "Question-Client")
public interface QuestionClient 
{
	@GetMapping("/question/getQuiz/{qzId}")
	List<Question> getQuestionsOfQuiz(@PathVariable Long qzId);
}
