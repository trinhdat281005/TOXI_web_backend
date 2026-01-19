package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

import lombok.Data;

@Data
public class Course {
private Integer courseId;
private 	String tilte;
private BigDecimal price;
private BigDecimal discountPrice;
private String thumbnailUrl;
private Integer totalLesson;
private Integer totalDuration;
private CourseLevel level;
public enum CourseLevel {basic, intermediate, advanced}
private List<Chapter> chapters;
private List<UserCourse> userCourses;
private List<CartItem> cartItems;
private List<OrderItem> orderItems;
private List<ComboItem> comboItems;


}
