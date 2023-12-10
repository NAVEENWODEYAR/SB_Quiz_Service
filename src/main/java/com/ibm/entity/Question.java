package com.ibm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question
{
	private Long qnId;
	private String qnName;
	private Long qzId;
}
