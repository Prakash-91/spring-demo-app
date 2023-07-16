package com.prakash.spring.demo;

import com.prakash.spring.demo.service.PaymentService;
import com.prakash.spring.demo.service.PaymentServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringDempAppApplicationTests {

	@Autowired
	PaymentService service;

	@Autowired
	PaymentServiceImpl serviceImpl;
	@Test
	public void test1(){
		System.out.println("Worked fine");
		Assertions.assertNotNull(service);
	}

	@Test
	public void test2(){
		System.out.println("Worked also fine");
		Assertions.assertNotNull(serviceImpl.getPaymentDao());
	}
}
