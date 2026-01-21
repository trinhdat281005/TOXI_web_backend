package com.example.demo.entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import lombok.Data;

@Data
@Entity
@Table(name = "Roles")
public class Role {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "role_id")
private Integer roleId;
@Column(name= "role_name")
private String roleName;
@OneToMany(mappedBy= "role",fetch= FetchType.LAZY,cascade = {
		CascadeType.PERSIST,CascadeType.DETACH,
		CascadeType.REFRESH, CascadeType.MERGE
})
private List<User> users;
}
