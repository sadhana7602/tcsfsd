package com.tcs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Day14EurekaRegistry1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day14EurekaRegistry1Application.class, args);
	}

}
