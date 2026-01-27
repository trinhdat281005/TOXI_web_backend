package com.example.demo.DTO;
import java.util.List;

import lombok.Data;

import lombok.Data;

@Data
public class QuizDTO {
	private Integer quizesId;
    private String title;
    private Integer timeLimit;
    private List<QuizQuestionDTO> questions;
}
