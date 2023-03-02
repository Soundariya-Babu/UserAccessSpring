package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.model.UserAccess;
import com.service.UserAccessService;

@RestController
//@RequestMapping("/user")
public class UserAccessController {
	@Autowired 
	private UserAccessService userAccessService;
	
	@PostMapping("/register")	 
	private String Store(@RequestBody UserAccess user) 
	{   
//	UserAccess user=new UserAccess();
//	user.setUserName(username);
//	user.setPassword(password);
//	user.setEmail(email);
//	user.setId(id);
	userAccessService.insertUser(user);
		
		return "success";
	}
	
	@PostMapping("/login")	 
	public String loginUser(@RequestParam("username") String username, 
			@RequestParam("password") String password,@RequestParam("id") Integer id) 
	{   
	UserAccess user=new UserAccess();
	user.setUserName(username);
	user.setPassword(password);
	user.setId(id);
	userAccessService.loginUser(user);
		
		return "success";
	}
	@GetMapping ("/getbyid")
	public 	UserAccess diplayById(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("id") Integer id)
	{
		UserAccess user=new UserAccess();
		user=userAccessService.getById(id);
		user.setUserName(username);
		user.setPassword(password);
		return user;
		
	}

}
