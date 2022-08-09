package com.security.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.app.model.User;
import com.security.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}

	@Override
	public User addAnUser(User user) {
		return repository.save(user);
	}

	@Override
	public User getAnUserById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public User getAnUserByUsername(String username) {
		return repository.findByUsername(username).orElse(null);
	}

}
