package com.example.demo.DTO;

import java.util.List;

import lombok.Data;

@Data
public class ChapterDTO {
	private Integer chapterId;
    private String title;
    private Integer orderIndex;
    private List<LessonDTO> lessons;
}
