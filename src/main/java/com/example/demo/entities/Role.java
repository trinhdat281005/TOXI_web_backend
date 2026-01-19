package com.example.demo.entities;


import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Role {
private Integer role_id;
private String role_name;
private List<User> users;
}
