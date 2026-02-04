package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.LoginRequestDTO;
import com.example.demo.DTO.LoginResponseDTO;
import com.example.demo.DTO.RegisterRequestDTO;
import com.example.demo.DTO.RegisterResponseDTO;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {
@Autowired
private UserService userService ;
@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody @Valid RegisterRequestDTO   dto) {
	if (!dto.getPassWord().equals(dto.getConfirmPassword())) {
        throw new RuntimeException("Mật khẩu xác nhận không khớp");
    }
	 User user = new User();
	    user.setUserName(dto.getUserName());
	    user.setPassWord(dto.getPassWord());
	    user.setFullName(dto.getFullName());
	    user.setEmail(dto.getEmail());
	  
	    user.setPhone(dto.getPhone());
	    User  savedUser = userService.register(user);
	    RegisterResponseDTO reg = new RegisterResponseDTO();
	    reg.setUserId(savedUser.getUserId());
	    reg.setUserName(savedUser.getUserName());
	    reg.setFullName(savedUser.getFullName());
	    reg.setEmail(savedUser.getEmail());
	   
	    reg.setPhone(savedUser.getPhone());
	    return ResponseEntity.ok(reg);
	    		}

@PostMapping("/login")
private LoginResponseDTO login(@Valid @RequestBody LoginRequestDTO dto) {
	User user;
	if(dto.getEmailOrUsername().contains("@")){
			user = userService.loginByEmail(dto.getEmailOrUsername(), dto.getPassWord());
			}
	
	
			else {
				user = userService.loginByUserName(dto.getEmailOrUsername(), dto.getPassWord());
			}
	
	
	  LoginResponseDTO res = new LoginResponseDTO();
      res.setUserId(user.getUserId());
      res.setUserName(user.getUserName());
      res.setEmail(user.getEmail());
      res.setFullName(user.getFullName());
      
		return  res;
}

@GetMapping("/ping")
public String ping() {
    return "pong";
}
}
