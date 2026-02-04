package com.example.demo.DTO;

import jakarta.validation.constraints.NotBlank;

public class LoginRequestDTO {
	  @NotBlank(message = "Tài khoản không được để trống")
	    private String emailOrUsername;

	    @NotBlank(message = "Password không được để trống")
	    private String passWord;

		public String getEmailOrUsername() {
			return emailOrUsername;
		}

		public void setEmailOrUsername(String emailOrUsername) {
			this.emailOrUsername = emailOrUsername;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
}
