package com.example.demo.entities;
import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table ( name="Lessons")

public class Lesson {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id")
    private Integer lessonId;

    @Column(nullable = false)
    private String title;

    @Column(name = "video_url")
    private String videoUrl;
    @Column ( name = "duration")
    private Integer duration;

    @Column(name = "is_free")
    private Boolean isFree = false;

    @Column(name = "attachment_url")
    
    
    private String attachmentUrl;
    @OneToMany(mappedBy = "lesson", fetch = FetchType.LAZY)
    private List<CourseContent> courseContents = new ArrayList();
    		@OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();
    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Flashcard> flashcards = new ArrayList<>();
}
