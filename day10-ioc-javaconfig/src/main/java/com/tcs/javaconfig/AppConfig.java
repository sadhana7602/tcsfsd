package com.tcs.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
	public HelloWorld getBean() {
		return new HelloWorldIMPL();
	}

}
