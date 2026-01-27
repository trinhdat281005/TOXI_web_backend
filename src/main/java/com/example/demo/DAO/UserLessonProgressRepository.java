package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.UserLessonProgress;


public interface UserLessonProgressRepository extends JpaRepository<UserLessonProgress,Integer> {
	Optional<UserLessonProgress> findByUser_UserIdAndLesson_LessonId(Integer userId, Integer lessonId);
}

