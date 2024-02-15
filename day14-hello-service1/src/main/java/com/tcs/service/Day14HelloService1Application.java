package com.tcs.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Day14HelloService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day14HelloService1Application.class, args);
	}

}
