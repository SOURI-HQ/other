package com.souri.spring.springbasics;

import com.souri.spring.springbasics.cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsCDIApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsCDIApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsCDIApplication.class)) {
			CdiBusiness business = applicationContext.getBean(CdiBusiness.class);

			LOGGER.info("{}, dao-{}", business, business.getCdiDao());
		}
	}
}
