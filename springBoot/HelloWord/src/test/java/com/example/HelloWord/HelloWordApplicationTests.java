package com.example.HelloWord;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // loads the application contex (beans)
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //If we don't declare it on our test class, 
												//the lifecycle mode will be PER_METHOD by default. 
												//So, to prevent our test class from throwing a JUnitException,
												//we need to annotate it with @TestInstance(TestInstance.Lifecycle.PER_CLASS).
class HelloWordApplicationTests {

	@Autowired
	HelloWordApplication app;
	
	@BeforeAll
	void beforeAllLoads() {
		System.out.println("Loads Before all the method");
	}

	@AfterAll
	void AfterAllLoads() {
		System.out.println("loads after all the methods");
	}

	@BeforeEach
	void Before() {
		System.out.println("loads before each method");
	}

	@AfterEach
	void After() {
		System.out.println("loads after each method");
	}

	@Test
//	void contextLoads() { if the method name by dfault is contextLoad it runs as a loas method
	void methodOne() {
		System.out.println("First Test");
	}

	@Test
	void methodTwo() {
		System.out.println("Second test");
	}
	
	@Test
	void getNameTest() {
		System.out.println(app.getName());
		Assertions.assertEquals("Vignesh", app.getName());
	}
}
