package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;



public interface CategoryRepository extends JpaRepository<Category,Integer> {
	List<Category> findByTitleContainingIgnoreCase(String title);
}
