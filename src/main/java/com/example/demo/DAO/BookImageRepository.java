package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BookImage;

public interface BookImageRepository extends JpaRepository<BookImage, Integer> {
	List<BookImage> findByBook_BookId(Integer bookId); // Lấy bộ sưu tập ảnh cho 1 cuốn sách
}
