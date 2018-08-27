package com.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzp.entities.User;
import com.wzp.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})


public class MyBatisTest {
	
	@Autowired  
    UserService userService;  
	
	@Test
	public void testGetAllUser(){
		List<User> users = userService.getAllUsers();
		System.out.println(users.size());
		System.out.println("1111");
	}
}
