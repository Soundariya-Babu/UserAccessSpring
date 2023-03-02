package com.DAO;

import com.model.UserAccess;

public interface UserAccessDAO {

	public void registerUser(UserAccess user);
	public  UserAccess getUserById(Integer id);
}
