package com.example.demo.DTO;

import lombok.Data;

@Data
public class UserRegisterRequest {
	private String username;
    private String password;
    private String email;
    private String fullName;
    private String phone;
}
