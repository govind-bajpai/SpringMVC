package com.gyanda.oAuth2.daos;

import java.util.List;

import com.gyanda.oAuth2.models.User;
import com.gyanda.oAuth2.serviceController.UserResponse;

public interface UserDAO {
		public UserResponse addUser(User user);
		public void updateUser(User user);
		public List<User> listUsers();
		public User getUserById(int id);
		public void removeUser(int id);
		public List<User> getUserByEmail(String email);
		public List<User> getUserByLastName(String lastName);
		public User getUserByUserNameAndPassword(String userName,String password);
		public User getUserByEmailAndPassword(String email,String password);
}
