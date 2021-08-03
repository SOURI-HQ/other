package com.souri.spring.springbasics;

import com.souri.spring.springbasics.cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsCDIApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsCDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsCDIApplication.class, args);

		CdiBusiness business = applicationContext.getBean(CdiBusiness.class);

		LOGGER.info("{}, dao-{}", business, business.getCdiDao());
	}

}
