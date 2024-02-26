package com.tcs.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses=com.tcs.springsecurity.repository.UserRepository.class)
public class Day20springsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day20springsecurityApplication.class, args);
	}

}
