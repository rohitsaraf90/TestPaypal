package com.example.TestPaypal.repository;

import java.util.List;

import com.example.TestPaypal.model.User;

public interface TestRepository { 
	
	public List<User> getAllData();

	public User createUser(User user);

	public User updateUser(User user)  throws Exception;

}
