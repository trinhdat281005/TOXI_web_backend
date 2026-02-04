package com.example.demo.DTO;

public class ExerciseDetailResponseDTO {
	private Integer quizId;
    private String title;
    private Integer totalQuestions;    // Số câu hỏi (ví dụ: 25 câu)
    private Integer timeLimit;        // Thời gian làm bài (phút) (ví dụ: 30:00)
    private Integer maxAttempts;      // Số lần làm bài tối đa (ví dụ: 10 lần)
    private Integer userAttempts;     // Số lần user đã làm (để hiện 0/10)
    private Integer maxPauses;        // Số lần tạm dừng tối đa (ví dụ: 3 lần)
    private Double passScorePercent;  // Điểm để vượt qua (ví dụ: 60%)
    private Integer lastScore;        // Điểm lần gần nhất (để hiện số 0 lớn ở giữa)
    private String documentUrl;
}
