package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = " Courses")
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "title", nullable = false) 
    private String title;

    @Column(precision = 15, scale = 2)
    private BigDecimal price;

    @Column(name = "discount_price", precision = 15, scale = 2)
    private BigDecimal discountPrice;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "total_lesson")
    private Integer totalLesson;
    
    @Column(name = "total_duration")
    private Integer totalDuration;

    @Enumerated (EnumType.STRING)
    private CourseLevel level;

    public enum CourseLevel { basic, intermediate, advanced }
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Chapter> chapters = new ArrayList<>();

@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
private List<UserCourse> userCourses = new ArrayList<>();
@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
private List<CartItem> cartItems = new ArrayList<>();
@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
private List<OrderItem> orderItems = new ArrayList<>();
@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
private List<ComboItem> comboItems = new ArrayList<>();


}
