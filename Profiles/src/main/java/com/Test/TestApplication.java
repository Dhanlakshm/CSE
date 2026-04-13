package com.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
	Logger logger=LoggerFactory.getLogger(TestApplication.class);

	logger.info("INFO message");
	logger.warn("WARNING message");
	logger.error("ERROR message");
	}

}
