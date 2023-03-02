package com.main;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class UserAccessApplication {
	private static Logger logger = LogManager.getLogger(UserAccessApplication.class);


	public static void main(String[] args) {
		logger.info("Initializing Spring boot");
		SpringApplication.run(UserAccessApplication.class, args);
		logger.info("Spring boot initialized");
	}

}
