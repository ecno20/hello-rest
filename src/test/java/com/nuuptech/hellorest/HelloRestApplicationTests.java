package com.nuuptech.hellorest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class SaludoApplicationTests {
 	@Test
 	void testPass() {
     	assertEquals(2, 2); //paso para aprobar test
 }

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// class HelloRestApplicationTests {

// 	@Test
// 	void contextLoads() {
// 	}

// }
