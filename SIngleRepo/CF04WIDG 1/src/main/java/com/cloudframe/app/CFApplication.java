package com.cloudframe.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The application can be started  Via rest invocation
 *  
 * @author CloudFrame Inc. Code Generator
 *
 */
@SpringBootApplication
public class CFApplication {
	public static void main(String[] args) {
			//logger.info("Running on Java version: " + System.getProperty("java.version"));
	        int exitCode = 0;
            SpringApplication.run(CFApplication.class);

	}
}
