package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Order;


public interface OrderRepository extends JpaRepository< Order,Integer> {
	List<Order> findByUser_UserIdOrderByCreatedAtDesc(Integer userId);
	Optional<Order> findByOrderCode(String orderCode); // Tra cứu vận đơn
}
