package com.wzp.service;

import java.util.List;

import com.wzp.entities.User;

public interface UserService {

	List<User> getAllUsers();
	
	User getUserById(int id);
}
