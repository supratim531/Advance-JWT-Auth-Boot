package com.security.app.service;

import java.util.List;

import com.security.app.model.User;

public interface UserService {

	public List<User> getAllUser();

	public User addAnUser(User user);

	public User getAnUserById(Long id);

	public User getAnUserByUsername(String username);

}
