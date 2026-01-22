package com.example.demo.entities;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table ( name = "Oder_item")
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oderItemId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Oder_id")
    private Oder oder;
	
	@Column(name = "item_id")
    private Integer itemId;
	
	@Enumerated(EnumType.STRING) // Dùng Enum cho chuyên nghiệp
    @Column(name = "item_type")
    private ItemType itemType;
	
	@Column(name = "price_at_purchase", nullable = false, precision = 15, scale = 2)
    private BigDecimal priceAtPurchase;
	
	@Column(name = "quantity")
    private Integer quantity;
	
	@OneToOne(mappedBy = "oderItem", cascade = CascadeType.ALL)
    private ShippingOder shippingInfo; 
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", referencedColumnName = "course_id", insertable = false, updatable = false)
	
    private Course course;
	
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", referencedColumnName = "book_id", insertable = false, updatable = false)
    private Book book;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", referencedColumnName = "combo_id", insertable = false, updatable = false)
    private Combo combo;
   
    public enum ItemType { Book, Course, Combo }
    
}
