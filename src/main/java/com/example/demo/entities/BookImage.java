package com.example.demo.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "Book_image")
public class BookImage {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_image_id")
    private Integer bookImageId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
	
	@Column(name = "image_url", nullable = false, columnDefinition = "TEXT")
    private String imageUrl;
	
	@Column(name = "is_thumbnail")
    private Boolean isThumbNail = false;
	
	@Column(name = "created_at", updatable = false)
    @CreationTimestamp // Tự động điền ngày giờ khi thêm ảnh
    private LocalDateTime createdAt;
}
