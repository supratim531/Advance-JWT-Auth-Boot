package com.security.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.app.model.CustomUserDetails;
import com.security.app.model.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getAnUserByUsername(username);

		if (user != null) {
			return new CustomUserDetails(user);
		}

		System.out.println("----- User not found in DB -----");
		throw new UsernameNotFoundException("User not found in DB");
	}

}
