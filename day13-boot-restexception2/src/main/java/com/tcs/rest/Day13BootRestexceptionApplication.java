package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day13BootRestexceptionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Day13BootRestexceptionApplication.class, args);
		String beans[] = context.getBeanDefinitionNames();
		for(String bean:beans) {
			System.out.println(bean);
		}
		
	}

}
