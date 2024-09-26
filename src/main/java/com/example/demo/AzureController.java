package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AzureController {
	
	
	@GetMapping("/azure")
	public String message() {
		return "First Welcome to Springboot Azure Deployment";
	}

}
