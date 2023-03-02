package com.service;

import com.model.UserAccess;

public interface UserAccessService {
	 public void insertUser(UserAccess user);
	 public String loginUser(UserAccess user);
	 public UserAccess getById(Integer id);
}
