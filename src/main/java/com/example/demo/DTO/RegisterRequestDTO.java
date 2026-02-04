package com.example.demo.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterRequestDTO {
	 @NotBlank(message = "Username không được để trống")
	    private String userName;

	    @NotBlank(message = "Password không được để trống")
	    @Size(min = 6, message = "Password tối thiểu 6 ký tự")
	    private String passWord;

	    @NotBlank(message = "Password không được để trống")
	    @Size(min = 6, message = "Password tối thiểu 6 ký tự")
	    private String confirmPassword;

	 

	    @NotBlank(message = "Họ tên không được để trống")
	    private String fullName;
	    
	    @Email
	    @NotBlank(message = "Email không được để trống")
	    private String email;
	    
	    @NotBlank(message = "Số điện thoại không được để trống")
	    private String phone;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

		public String getConfirmPassword() {
			return confirmPassword;
		}

		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
	    
}
