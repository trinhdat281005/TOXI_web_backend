package com.example.demo.DAO;

import java.awt.print.Pageable;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Comment;





public interface CommentRepository  extends JpaRepository<Comment, Integer>{
	// Lấy bình luận của bài học, sắp xếp mới nhất (Phân trang Pageable)
    Page<Comment> findByLesson_LessonIdOrderByCreatedAtDesc(Integer lessonId, Pageable pageable);
}
