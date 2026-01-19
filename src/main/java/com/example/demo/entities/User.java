package com.example.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
private Integer user_id;
private String email;
private String username;
private  String passwordd;
private String full_name;
private Integer phone;
private Boolean status;
private String address;
private String avatarr_url;
private Role role;

}
