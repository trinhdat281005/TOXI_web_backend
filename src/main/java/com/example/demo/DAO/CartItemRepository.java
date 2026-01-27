package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CartItem;



public interface CartItemRepository extends JpaRepository<CartItem,Integer> {
	Optional<CartItem> findByCart_CartIdAndItemIdAndItemType(Integer cartId, Integer itemId, String itemType); // Check trùng món
}
