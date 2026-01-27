package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ComboItem;

public interface ComboItemRepository  extends JpaRepository<ComboItem, Integer>{
	List<ComboItem> findByCombo_ComboId(Integer comboId); // Lấy danh sách món trong combo
}
