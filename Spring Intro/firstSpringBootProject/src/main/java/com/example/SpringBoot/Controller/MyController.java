package com.example.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Welcome to my first Spring Boot Application";
	}
}
