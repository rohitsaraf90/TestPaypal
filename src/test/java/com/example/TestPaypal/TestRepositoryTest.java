package com.example.TestPaypal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.TestPaypal.model.User;
import com.example.TestPaypal.repository.impl.TestRepositoryImpl;

@SpringBootTest
public class TestRepositoryTest {

	@Test
	public void testCreate() {
		TestRepositoryImpl repository = new TestRepositoryImpl();
		User testUser = new User();
		testUser.setAge(22);
		testUser.setName("Paypal");
		User actual = repository.createUser(testUser);
		assertEquals("Paypal", actual.getName());

	}

	@Test
	public void testUpdate() {
		TestRepositoryImpl repository = new TestRepositoryImpl();
		User response = new User();
		response.setAge(22);
		response.setName("Paypal");
		User actual;
		try {
			actual = repository.updateUser(response);
			assertEquals("Molex", actual.getName());
		} catch (Exception e) {
			assertEquals("user Not found", e.getMessage());
		}

	}

}
