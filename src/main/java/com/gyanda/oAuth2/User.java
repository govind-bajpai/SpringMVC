package com.gyanda.oAuth2;

import org.springframework.context.annotation.Bean;

public class User {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public User(String name) {
		this.userName = name;
	}
}