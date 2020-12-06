package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
	
	@Autowired
	GreetingService greetingService;

	@GetMapping("/greet")
	public String greeting() {
		return "Hello from: SecondController";
	}
	

	@GetMapping("/user")
	public User getUser() {
		return greetingService.getUser();
	}
}
