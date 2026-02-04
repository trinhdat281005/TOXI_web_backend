package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.RoleRepository;
import com.example.demo.DAO.UseRepository;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UseRepository userepository;
@Autowired
private RoleRepository rolerepository;
	@Override
	public User register(User user) {
		if(userepository.existsByEmail(user.getEmail())) {
			throw new RuntimeException("Email đã tồn tại");
		}
		 if (userepository.existsByUserName(user.getUserName())) {
	            throw new RuntimeException("Username đã tồn tại");
	        }
		 Role userRole = rolerepository.findByRoleName("STUDENT")
	                .orElseThrow(() -> new RuntimeException("Role USER không tồn tại"));

	        user.setRole(userRole);
		 if (user.getUserName() == null || user.getUserName().isEmpty())
		        throw new RuntimeException("Username không được để trống");

		    if (user.getPassWord() == null || user.getPassWord().isEmpty())
		        throw new RuntimeException("Password không được để trống");

		    if (user.getEmail() == null || user.getEmail().isEmpty())
		        throw new RuntimeException("Email không được để trống");

		    if (user.getFullName() == null || user.getFullName().isEmpty())
		        throw new RuntimeException("Full name không được để trống");

		    if (user.getPhone() == null || user.getPhone().isEmpty())
		        throw new RuntimeException("Phone không được để trống");

		 
		return userepository.save(user);
	}

	@Override
	public User loginByEmail(String email, String passWord) {
		
		  return userepository.findByEmailAndPassWord(email, passWord).orElseThrow(() -> new RuntimeException("Sai email hoặc mật khẩu"));
	}

	@Override
	public User loginByUserName(String userName, String passWord) {
		  return userepository
	                .findByUserNameAndPassWord(userName, passWord)
	                .orElseThrow(() -> new RuntimeException("Sai username hoặc mật khẩu"));
	}

}
