package com.example.demo.entities;
import java.security.Timestamp;
import java.util.ArrayList;

import java.util.List;



public class QuizResult {
	private Integer quizResultId;
    private User user;      
    private Quiz quiz;         
    
    private Integer score;
    private Timestamp submittedAt;
    private Integer totalQuestions;
    private Integer correctAnswers;
    private Integer wrongAnswers;
    private Integer timeSpent;
    private String status;
    private List<QuizAttemptDetail> quizAttemptDetails;
}
