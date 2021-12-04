package com.example.TestPaypal.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestPaypal.model.User;
import com.example.TestPaypal.repository.TestRepository;
import com.example.TestPaypal.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;
	
	@Override
	public List<User> getAllData() {
		// TODO Auto-generated method stub
		return testRepository.getAllData();
	}

	@Override
	public User createUser(User user) {
		return testRepository.createUser(user);
	}

	@Override
	public User updateUser(User user)  throws Exception {
		return testRepository.updateUser(user);
	}

	
}
