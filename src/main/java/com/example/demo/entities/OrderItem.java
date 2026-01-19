package com.example.demo.entities;

import java.math.BigDecimal;

public class OrderItem {
	private Integer oderItemId;
    private Oder oder;
    private Integer itemId;
    private String itemType;
    private BigDecimal priceAtPurchase;
    private Integer quantity;
    private ShippingOder shippingInfo; // 1-1 với thông tin vận chuyển
    private Course course;
    private User user;
    
}
