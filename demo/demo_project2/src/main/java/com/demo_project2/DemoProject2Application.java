package com.demo_project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class DemoProject2Application {

	public static void main(String[] args) {

		SpringApplication.run(DemoProject2Application.class, args);

		Logger logger=LoggerFactory.getLogger(DemoProject2Application.class);
		logger.info("INFO message");
		logger.warn("Warning message");
		logger.error("ERROR message");

	}

}
