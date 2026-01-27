package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.QuizResult;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult,Integer> {
	List<QuizResult> findByUser_UserIdOrderBySubmittedAtDesc(Integer userId); // Xem lịch sử điểm thi
}
