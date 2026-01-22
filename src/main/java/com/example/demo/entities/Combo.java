package com.example.demo.entities;
import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Data
@Table(name = "Combo")
public class Combo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "combo_id")
	private Integer comboId;
	
	@Column(nullable = false)
    private String name;
	
	@Column(name = "combo_price", precision = 15, scale = 2)
    private BigDecimal comboPrice;
	
	@Column(name = "original_price", precision = 15, scale = 2)
    private BigDecimal originalPrice;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "thumbnail_url")
    private String thumnailUrl;
    
    @OneToMany(mappedBy = "combo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComboItem> comboItems = new ArrayList<>();
    
    @OneToMany(mappedBy = "combo")
    private List<OrderItem> orderItems = new ArrayList<>();
}
