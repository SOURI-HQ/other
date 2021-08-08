package com.souri.spring.springbasics;

import com.souri.spring.springbasics.basic.BinarySearchImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsBasicApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

			int result = binarySearch.binarySearch(new int[]{17, 8, 25}, 7);
			System.out.println(result);
		}
	}
}
