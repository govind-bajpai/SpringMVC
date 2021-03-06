package com.gyanda.oAuth2.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gyanda.oAuth2.daos.UserDAO;
import com.gyanda.oAuth2.models.User;
import com.gyanda.oAuth2.serviceController.UserResponse;

@Transactional 
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserResponse addUser(User user) {
		return this.userDAO.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		this.userDAO.updateUser(user);
		
	}

	@Override
	public List<User> listUsers() {
		return this.userDAO.listUsers();
	}

	@Override
	public User getUserById(int id) {
		return this.userDAO.getUserById(id);
	}

	@Override
	public void removeUser(int id) {
		this.userDAO.removeUser(id);
	}

	@Override
	public boolean authenticateUser(String email, String password) {
		User user = this.userDAO.getUserByEmail(email).get(0);
		if(user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
}
