package com.example.demo.entities;

public class QuizAttemptDetail {
	private Integer id;
    private QuizResult quizResult;  
    private QuizQuestion quizQuestion;   
    private QuizOption selectedOption;
    
    private Boolean isCorrect;
    private String answerText;       
    private Integer orderIndex;
}
