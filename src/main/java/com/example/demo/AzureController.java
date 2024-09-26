package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AzureController {
	
	
	@GetMapping("/azure")
	public String message() {
		return "=========WELCOME TO SPRINGBOOT DEPLOYMENT IN AZURE========";
	}

}
