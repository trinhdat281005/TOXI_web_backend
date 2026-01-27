package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Course;
import com.example.demo.entities.Lesson;


public interface LessonRepository extends JpaRepository<Lesson,Integer> {
	
}
