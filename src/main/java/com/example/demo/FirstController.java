package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/first")
//@RequestMapping("/first")
public class FirstController {
	
	@Autowired
	GreetingService greetingService;

	@GetMapping("/greet")
	public String greeting() {
		return greetingService.greet();
	}
}
