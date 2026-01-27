package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Flashcard;
@Repository

public interface FlashcardRepository extends JpaRepository<Flashcard,Integer> {
	List<Flashcard> findByLesson_LessonId(Integer lessonId); // Lấy bộ từ vựng theo bài học
	}
