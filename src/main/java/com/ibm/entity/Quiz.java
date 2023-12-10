package com.ibm.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Quiz
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long qId;
	private String qTitle;
	
	transient private List<Question> questions;
}
