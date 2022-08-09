package com.security.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

	@GetMapping("/")
	public String home() {
		String message = "<h1>This is home page (Public)</h1>";
		return message;
	}

	@GetMapping("/welcome")
	public String welcome() {
		String message = "<h1>Welcome user to our website (Private)</h1>";
		return message;
	}

	@GetMapping("/admin")
	public String adminEndPoint() {
		return "<h1>This is admin end-point</h1>";
	}

	@GetMapping("/normal-user")
	public String normalUserEndPoint() {
		return "<h1>This is normal-user end-point</h1>";
	}

}
