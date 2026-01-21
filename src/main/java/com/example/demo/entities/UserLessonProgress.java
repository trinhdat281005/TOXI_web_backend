package com.example.demo.entities;

import java.time.LocalDateTime;

public class UserLessonProgress {
	private Integer userLessonProgressId;
    private User user;
    private Lesson lesson;
    private Boolean isCompleted;
    private Integer lastPosition;
    private LocalDateTime lastAccessedAt;

    private LocalDateTime completedAt;
}
