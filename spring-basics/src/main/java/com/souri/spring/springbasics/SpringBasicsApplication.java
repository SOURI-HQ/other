package com.souri.spring.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {17, 8, 25}, 7);
		System.out.println(result);
	}

}
