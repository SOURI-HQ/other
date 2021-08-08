package com.souri.spring.springbasics;

import com.souri.spring.springbasics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasicsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXMLContextApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			LOGGER.info("{} beans are being loaded: {}", applicationContext.getBeanDefinitionCount(), applicationContext.getBeanDefinitionNames());

			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		}
	}
}
