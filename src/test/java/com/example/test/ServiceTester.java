package com.example.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.web.SpringbootDemoApplication;
import com.example.web.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class ServiceTester {
	@Autowired
	private UserService userSerivce;

	@Before
	public void setUp() {
	
	}

	@Test
	public void test() throws Exception {

		System.out.println(userSerivce.getAllUsers());
		
		userSerivce.create("5", 20);

	}
}
