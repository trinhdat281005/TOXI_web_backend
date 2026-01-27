package com.example.demo.DAO;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CourseContent;


public interface CourseContentRepository extends JpaRepository<CourseContent, Integer> {
	List<CourseContent> findByChapter_ChapterIdOrderByOrderIndexAsc(Integer chapterId); // Sắp xếp Video và Quiz trong chương
}
