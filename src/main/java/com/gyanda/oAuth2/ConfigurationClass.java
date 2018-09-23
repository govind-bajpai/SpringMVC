package com.gyanda.oAuth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public User getUser() {
		return new User("Govind");
	}

}
