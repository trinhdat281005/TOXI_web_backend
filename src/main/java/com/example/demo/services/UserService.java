package com.example.demo.services;

import com.example.demo.entities.User;

public interface UserService {
User register( User user);
User loginByEmail (String email , String passWord);
User loginByUserName ( String userName , String passWord);
}
