package com.wzp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzp.dao.UserDao;
import com.wzp.entities.User;
import com.wzp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	UserDao userdao;
	
	@Override
	public List<User> getAllUsers() {
		return userdao.getAllUsers();
	}

	@Override
	public User getUserById(int id) {
		return userdao.getUserByID(id);
	}

	
}
