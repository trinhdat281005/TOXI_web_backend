package com.example.demo.DTO;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class CourseResponse {
	private Integer courseId;
    private String title;
    private String description;
    private BigDecimal price;
    private String level;
    private BigDecimal discountPrice;
    private List<ChapterDTO> chapters;
}
