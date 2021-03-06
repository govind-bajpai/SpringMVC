package com.gyanda.oAuth2.services;

import java.util.List;

import com.gyanda.oAuth2.models.User;
import com.gyanda.oAuth2.serviceController.UserResponse;

public interface UserService {

	public UserResponse addUser(User p);
	public void updateUser(User p);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public boolean authenticateUser(String email,String password);
	
}
