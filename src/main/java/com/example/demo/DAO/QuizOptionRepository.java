package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.QuizOption;

@Repository
public interface QuizOptionRepository extends JpaRepository<QuizOption, Integer> {
	List<QuizOption> findByQuizquestion_QuizQuestionId(Integer questionId); // Lấy A, B, C, D

}
