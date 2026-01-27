package com.example.demo.DAO;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cart;
public interface CartRepository extends JpaRepository<Cart, Integer> {
	Optional<Cart> findByUser_UserId(Integer userId); // Lấy giỏ hàng của User đang đăng nhập
}
	