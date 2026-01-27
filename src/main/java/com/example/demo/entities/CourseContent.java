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
@Table (name = "Course_contents")
public class CourseContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer courseContentId;
@Column(name = "content_type")
private String contentType; 
@Column(name="content_ref_id")
private Integer contentRefId;
@Column(name="order_index")
private Integer orderIndex;
@Column(name="is_preview")
private Boolean isPreview;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "content_ref_id", referencedColumnName = "lesson_id", insertable = false, updatable = false)
private Lesson lesson;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "content_ref_id", referencedColumnName = "quizes_id", insertable = false, updatable = false)
private Quiz quiz;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn (name = "chapter_id")
private Chapter chapter;
}
