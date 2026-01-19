package com.example.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
public class User {
private Integer userId;
private String email;
private String username;
private  String passWordd;
private String fullName;
private Integer phone;
private Boolean status;
private String address;
private String avatarrUrl;
private LocalDateTime  createdAt;
private Role role;
private Cart cart;
private List<Oder> oders;
private List<UserLessonProgress> userLessonProgresss;
private List<UserCourse> userCourses;
private List<QuizResult> quizResults;
private List<Comment> comments;
}
