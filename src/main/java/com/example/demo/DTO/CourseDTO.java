package com.example.demo.DTO;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class CourseDTO {
	private Integer courseId;
    private String title;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private String level;
    private Integer totalLesson;
    private List<ChapterDTO> chapters;
}
