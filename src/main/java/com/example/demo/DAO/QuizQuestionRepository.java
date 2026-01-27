package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.QuizQuestion;

@Repository
public interface QuizQuestionRepository  extends JpaRepository<QuizQuestion, Integer> {
	List<QuizQuestion> findByQuiz_QuizesIdOrderByOrderIndexAsc(Integer quizId); // Lấy bộ câu hỏi
}
