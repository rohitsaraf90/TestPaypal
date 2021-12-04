package com.example.TestPaypal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestPaypalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPaypalApplication.class, args);
	}
	
	
	public int nearestPrime(int number) {
		int response =number; 
		int counter =0; -5
		boolean isFound = false; 
		int nextnumber = 0;
		int previousNumber = 0;
		while(!isFound) {
			nextnumber = number +counter; -5
			previousNumber = number - counter -5
			if(isPrime(nextnumber)) {
				response = nextnumber;
				isFound = true;
			}
			if(isPrime(previousNumber)) {
				response = previousNumber;
				isFound = true;
			}
			counter++;
			
			
		}
		
		
		return response;
	}
	
	public boolean isPrime(int number) {
		return true;
	}

}
