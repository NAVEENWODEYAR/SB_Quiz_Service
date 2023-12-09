package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Long> 
{

}
