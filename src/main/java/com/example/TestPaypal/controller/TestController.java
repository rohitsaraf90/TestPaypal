package com.example.TestPaypal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestPaypal.model.User;
import com.example.TestPaypal.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestService testService;

	@GetMapping("/")
	public List<User> getAllData(){
		return testService.getAllData();
	}
	
	
	@PostMapping("/")
	public User createUser(@RequestBody User user){
		return testService.createUser(user);
	}
	
	@PutMapping("/")
	public ResponseEntity<Object> updateUser(@RequestBody User user){
		ResponseEntity<Object> response = null;
		try {
			User updatedUserResponse = testService.updateUser(user);
			response = new ResponseEntity<Object>(updatedUserResponse, HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	
}
