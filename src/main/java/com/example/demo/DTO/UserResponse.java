package com.example.demo.DTO;

import lombok.Data;

@Data
public class UserResponse {
	private Integer userId;
    private String username;
    private String email;
    private String fullName;
    private String phone;
    private String roleName; // Chuyển từ Role Entity sang String
    private Integer status;
}
