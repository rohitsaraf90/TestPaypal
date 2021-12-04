package com.example.TestPaypal.service;

import java.util.List;

import com.example.TestPaypal.model.User;

public interface TestService {
	
	public List<User> getAllData();

	public User createUser(User user);

	public User updateUser(User user)  throws Exception;

}
