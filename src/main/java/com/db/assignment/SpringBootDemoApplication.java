package com.db.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;




/**
 * The Class SpringBootDemoApplication.
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan("com.db")
public class SpringBootDemoApplication  {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
