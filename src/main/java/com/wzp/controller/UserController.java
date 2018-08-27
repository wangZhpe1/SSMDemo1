package com.wzp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wzp.entities.User;
import com.wzp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test(HttpServletRequest req,Model model){
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("userid="+id);
		User user=new User();
		user.setAge(8);
		user.setId(id);
		user.setPassword("123");
		user.setUserName("wzp");
		log.debug(user.toString());
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value="/getUser/{id}")
	public String getUserById(@PathVariable("id")String id,Model model){
		//User user = userService.getUserById(id);
		//model.addAttribute("user", user);
		int i = Integer.parseInt(id);
		System.out.println(i);
		return "index";
	}
	
	@RequestMapping(value="/jsonTest/{id}")
	public ResponseEntity<User> toJson(@PathVariable String id,Map<String, Object> map){
		User user = userService.getUserById(Integer.parseInt(id));
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
