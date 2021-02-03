package com.rulesware.datatransform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String welcomeMessage() {
		return "Hello from Rulesware";
	}
	
}
