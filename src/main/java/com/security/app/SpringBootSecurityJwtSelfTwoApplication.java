package com.security.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.app.model.User;
import com.security.app.service.UserService;

@SpringBootApplication
public class SpringBootSecurityJwtSelfTwoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtSelfTwoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = User.builder().username("supratim531").password(passwordEncoder.encode("123"))
				.email("supratim531@gmail.com").role("ROLE_NORMAL").build();
		User user2 = User.builder().username("sayan936").password(passwordEncoder.encode("321"))
				.email("sayan936@gmail.com").role("ROLE_NORMAL").build();
		User user3 = User.builder().username("amitava123").password(passwordEncoder.encode("root"))
				.email("amitava123@gmail.com").role("ROLE_ADMIN").build();

		userService.addAnUser(user1);
		userService.addAnUser(user2);
		userService.addAnUser(user3);
		System.out.println("----- 3 users saved -----");
	}

}
