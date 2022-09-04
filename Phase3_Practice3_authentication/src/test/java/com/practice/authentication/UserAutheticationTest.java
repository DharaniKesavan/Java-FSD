package com.practice.authentication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserAutheticationTest {
    private Userauthentication user;
    
    @BeforeAll
    public static void init() {
    	System.out.println("This is @BeforeAll");
    }
	
    @BeforeEach
	 public void check() {
		 user=new Userauthentication();
		 System.out.println("Test method initiated");
	}
	
    @Test
	public void verifyUserName() {
		assertEquals(user.getUserName(),"Dharani");
	}
	
    @Test
	public void verifyPassword() {
		assertEquals(user.getPassword(),"dharu@1234");
	}
	
    @Test
	public void verifyEmail() {
		assertEquals(user.getEmail(),"dharani19@gmail.com");
	}
	
    @Test
	public void verifyPhoneNumber() {
		assertEquals(user.getPhoneNumber(),1112223344);
	}
	
	@AfterEach
	public void tearDown() {
		user=null;
		System.out.println("Test method terminated");
	}
	
	@AfterAll
	public static void term() {
		System.out.println("This is @AfterAll");
	}
}