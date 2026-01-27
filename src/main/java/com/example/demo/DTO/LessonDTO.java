package com.example.demo.DTO;
import lombok.Data;

@Data
public class LessonDTO {
	private Integer lessonId;
    private String title;
    private String videoUrl;
    private Integer duration;
    private Boolean isFree;
}
