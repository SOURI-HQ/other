package com.souri.spring.springbasics;

import com.souri.spring.springbasics.basic.BinarySearchImpl;
import com.souri.spring.springbasics.properties.ExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringBasicsPropertiesApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsPropertiesApplication.class)) {
			ExternalService service = applicationContext.getBean(ExternalService.class);

			System.out.println(service.returnServiceURL());
		}
	}
}
