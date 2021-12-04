package com.example.TestPaypal.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example.TestPaypal.model.User;
import com.example.TestPaypal.repository.TestRepository;

@Repository
public class TestRepositoryImpl implements TestRepository {
	
	private static List<User> users = new ArrayList<User>(); 

	@Override
	public List<User> getAllData() {
		return users;
	}

	@Override
	public User createUser(User user) {
		user.setId(new Random().nextInt());
		users.add(user);
		return user;
	}

	@Override
	public User updateUser(User user) throws Exception {
		boolean isUserUpdated = false;
		for(User userdata: users) {
			if(userdata.getId() == user.getId()) {
				userdata.setAge(user.getAge());
				userdata.setName(user.getName());
				isUserUpdated = true;
				
			}
		}
		if(!isUserUpdated) {
			throw new Exception("user Not found");
		}else {
			return user;
		}
	}
	
	

}
