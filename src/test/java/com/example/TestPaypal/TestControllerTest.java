package com.example.TestPaypal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.TestPaypal.controller.TestController;
import com.example.TestPaypal.model.User;
import com.example.TestPaypal.service.TestService;

@SpringBootTest
public class TestControllerTest {
	
	@InjectMocks
	private TestController controller;
	
	@Mock
	private TestService service;
	
	@Test
	public void testCreate() {
		User testUser = new User();
		testUser.setAge(22);
		//testUser.setId(1);
		testUser.setName("Paypal");
		Mockito.when(service.createUser(testUser)).thenReturn(testUser);
		User response = controller.createUser(testUser);
		assertEquals("Paypal", response.getName());
		
	}

}
