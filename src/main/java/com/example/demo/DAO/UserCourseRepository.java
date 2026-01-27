package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.UserCourse;

public interface UserCourseRepository extends JpaRepository<UserCourse, Integer> {
	boolean existsByUser_UserIdAndCourse_CourseId(Integer userId, Integer courseId); // Check học viên đã mua khóa này chưa
}
