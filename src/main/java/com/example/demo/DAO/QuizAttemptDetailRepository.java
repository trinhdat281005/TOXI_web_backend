package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.QuizAttemptDetail;

@Repository
public interface QuizAttemptDetailRepository extends JpaRepository<QuizAttemptDetail, Integer> {

}
