package com.barath.dao;

import com.barath.model.UserDetail;

public interface UserDAO 
{
public boolean registerUser(UserDetail userDetail);
public boolean UpdateUser(UserDetail userDetail);
public UserDetail getUser(String username);
	
}
