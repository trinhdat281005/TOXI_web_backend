package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Course;


public interface CourseRepository extends JpaRepository<Course,Integer> {
	List<Course> findByTitleContainingIgnoreCase(String title);
}
