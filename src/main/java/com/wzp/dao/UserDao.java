package com.wzp.dao;

import java.util.List;

import com.wzp.entities.User;

public interface UserDao {

	List<User> getAllUsers();
	
	User getUserByID(int id);
}
