package com.example.demo.entities;
import java.util.ArrayList;

import java.util.List;



public class QuizQuestion {
	private Integer quizQuestionId;
    private Quiz quiz;
    private String questionType;
    private String content;
    private String audioUrl;
    private List<QuizOption>quizOptions;
    private Integer order_index;
}
