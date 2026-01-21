package com.example.demo.entities;

import java.util.ArrayList;

import java.util.List;

import java.math.BigDecimal;

public class Book {
 private Integer bookId;
 private String description;
 private String tilte;
 private BigDecimal price;
 private BigDecimal discount_price;
 private Integer stock;
 private   List<BookCategory> bookCategory;
 private  List<BookImage> bookImages;
 private List<ComboItem> comboItems;
 
 private  List<OrderItem> orderItems;
 private List<CartItem> cardItems;

 
}
 