package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = " Course_contents")
public class CourseContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer courseContentId;
@Column(name = "content_type")
private String contentType; 
private Integer contentRefId;
private Integer orderIndex;

private Boolean isPreview;
private Lesson lesson;
private Quiz quiz;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn (name = "chapter_id")
private Chapter chapter;
}
