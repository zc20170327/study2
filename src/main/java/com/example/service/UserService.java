package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.dao.UserDao;
import com.example.pojo.User;

@Service
public class UserService {
	@Autowired UserDao userDao;
	public List<User> getUser(){
		return  userDao.getUser();
	}
}
