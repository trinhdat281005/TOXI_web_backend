package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "name_category", nullable = false, length = 100)
    private String nameCategory;

 // Xóa đoạn ManyToOne cũ, thay bằng đoạn này:
    @ManyToMany(mappedBy = "categories")
    private List<Book> books = new ArrayList<>();
}