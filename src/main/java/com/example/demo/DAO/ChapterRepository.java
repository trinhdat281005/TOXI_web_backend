package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Chapter;
import com.example.demo.entities.Course;


public interface ChapterRepository extends JpaRepository<Chapter,Integer> {
	List<Chapter> findByCourse_CourseIdOrderByOrderIndexAsc(Integer courseId);
}
