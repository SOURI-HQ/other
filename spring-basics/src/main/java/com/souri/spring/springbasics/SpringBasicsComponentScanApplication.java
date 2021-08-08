package com.souri.spring.springbasics;

import com.souri.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.souri.spring.componentscan")
public class SpringBasicsComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsComponentScanApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsComponentScanApplication.class)) {
			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDAO);
		}
	}

}