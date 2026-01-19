package com.example.demo.entities;
import java.util.ArrayList;

import java.util.List;




public class Lesson {
	private Integer lessonId;
    private String title;
    private String videoUrl;
    private Integer duration;
    private Boolean isFree;
    private String attachmentUrl;
    private List<Comment> comments;
    private List<Flashcard> flashcards;
}
