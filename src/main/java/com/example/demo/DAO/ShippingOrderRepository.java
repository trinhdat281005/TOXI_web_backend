package com.example.demo.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ShippingOder;

public interface ShippingOrderRepository extends JpaRepository<ShippingOder, Integer> {
	Optional<ShippingOder> findByOrder_OrderId(Integer orderId); // Lấy địa chỉ giao hàng
}
