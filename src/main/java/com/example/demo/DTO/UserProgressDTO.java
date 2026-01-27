package com.example.demo.DTO;

import lombok.Data;

@Data
public class UserProgressDTO {
	private Integer courseId;
    private String courseTitle;
    private Double progressPercentage; // (Số bài đã học / Tổng số bài) * 100
}
	