package com.example.demo.DTO;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class CartItemResponse {
	private Integer cartItemId;
    private Integer itemId;
    private String itemType; // "Book", "Course", hoặc "Combo"
    private String itemName; // Tên lấy từ bảng tương ứng
    private String thumbnail;
    private Integer quantity;
    private BigDecimal priceAtPurchase;
    private BigDecimal subTotal; // Tự tính: price * quantity
}
