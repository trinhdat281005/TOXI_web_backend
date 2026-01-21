package com.example.demo.entities;

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
@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
private Integer userId;
	@Column(name = "email",length= 255)
private String email;
	@Column(name = "username",length=255)
private String userName;
	@Column(name="passwordd",length=512)
private  String passWordd;
	@Column(name="full_name",length=255)
private String fullName;
	@Column(name="phone")
private Integer phone;
	@Column(name="status")
private Boolean status;
	@Column(name="address")
private String address;
	@Column(name="avater_url")
private String avatarrUrl;
	@Column(name="created_at")
private LocalDateTime  createdAt;
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH,
			CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name = "role_id",nullable= false)
private Role role;
@OneToOne(mappedBy= "user")		
private Cart cart;
@OneToMany(mappedBy="user",fetch= FetchType.LAZY,cascade = {
		CascadeType.PERSIST,CascadeType.DETACH,
		CascadeType.REFRESH, CascadeType.MERGE
})

private List<Oder> oders;
@OneToMany(mappedBy="user",fetch= FetchType.LAZY,cascade = {
		CascadeType.PERSIST,CascadeType.DETACH,
		CascadeType.REFRESH, CascadeType.MERGE
})
private List<UserLessonProgress> userLessonProgresss;
@OneToMany(mappedBy="user",fetch= FetchType.LAZY,cascade = {
		CascadeType.PERSIST,CascadeType.DETACH,
		CascadeType.REFRESH, CascadeType.MERGE
})
private List<UserCourse> userCourses;
@OneToMany(mappedBy="user",fetch= FetchType.LAZY,cascade = {
		CascadeType.PERSIST,CascadeType.DETACH,
		CascadeType.REFRESH, CascadeType.MERGE
})
private List<QuizResult> quizResults;
@OneToMany(mappedBy="user",fetch= FetchType.LAZY,cascade = {
		CascadeType.PERSIST,CascadeType.DETACH,
		CascadeType.REFRESH, CascadeType.MERGE
})
private List<Comment> comments;
}
