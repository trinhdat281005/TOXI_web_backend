package com.example.demo.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CartItem {
	private Integer cartItemId;
    private Cart cart;
    private Integer itemId;
    private String itemType;
    private Integer quantity;
    private BigDecimal priceAtPurchase;
private LocalDateTime  createdAt;
}
