package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.UserAccessDAO;
import com.model.UserAccess;

@Service
public class UserAccessServiceImpl implements UserAccessService {

	@Autowired
	private UserAccessDAO userAccessDAO;
	
	@Override
	public void insertUser(UserAccess user) {
	
		userAccessDAO.registerUser(user);
		
	}

	@Override
	public String loginUser(UserAccess user1) {
		
		UserAccess user=new UserAccess();
		user=getById(user1.getId());
		if(user.getPassword()==user1.getPassword()&&user.getUserName()==user1.getUserName())
		{
			return "success";
		}
		return "failure";
		
	}

	@Override
	public UserAccess getById(Integer id) {
		UserAccess user=new UserAccess();
		user=userAccessDAO.getUserById(id);
		return user;
	}

}
