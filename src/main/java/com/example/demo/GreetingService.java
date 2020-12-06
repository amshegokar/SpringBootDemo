package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	@Value("${admin.name}")
	private String admin_name;
	
	@Value("${admin.email}")
	private String admin_email;
	
	@Value("${admin.mobnum}")
	private Long admin_mobnum;
	
	public String greet() {
		return "Hello At:"+new Date();
	}
	
	public User getUser() {
		return new User(admin_name, admin_email, admin_mobnum);
	}

}
