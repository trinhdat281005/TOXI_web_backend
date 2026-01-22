package com.example.demo.entities;
import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Quizes")

public class Quiz {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quizes_id")
    private Integer quizesId;
	@Column(nullable = false)
    private String title;
	@Column(name = "quiz_type")
    private String quizType;
	@Column(name = "pass_score")
    private Integer passScore;
	@Column(name = "time_limit")
    private Integer timeLimit;
	@OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<QuizQuestion> quizQuestions = new ArrayList<>();
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<QuizResult> quizResults = new ArrayList<>();
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<CourseContent> courseContents = new ArrayList<>();
    
}
