	package com.example.demo.entities;
	
	import java.util.ArrayList;
	
	import java.util.List;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
	import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn; // Dòng quan trọng nhất để sửa lỗi của bạn
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
	import jakarta.persistence.FetchType;
import lombok.Data;

import java.math.BigDecimal;
	@Entity
	@Data
	@Table(name = "Books")
	public class Book {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "book_id")
	    private Integer bookId;
		
		
		@Column(columnDefinition = "TEXT")
	    private String description;
		
	 @Column(name = "title", nullable = false)
	    private String title;
	 
	 @Column(precision = 15, scale = 2)
	    private BigDecimal price;
	 
	 @Column(name = "discount_price", precision = 15, scale = 2)
	    private BigDecimal discountPrice;
	 
	 private Integer stock;
	 
	 @ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(
	     name = "book_category_mapping",
	     joinColumns = @JoinColumn(name = "book_id"),
	     inverseJoinColumns = @JoinColumn(name = "category_id")
	 )
	 private List<Category> categories = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<BookImage> bookImages = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	    private List<ComboItem> comboItems = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	    private List<OrderItem> orderItems = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	    private List<CartItem> cartItems = new ArrayList<>();
	
	 
	}
	 