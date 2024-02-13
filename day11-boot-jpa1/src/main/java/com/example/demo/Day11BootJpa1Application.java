package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11BootJpa1Application implements CommandLineRunner{
	
	
	@Autowired
	ProductRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(Day11BootJpa1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product p1 = new Product();

		p1.setDescription("A digital television");
		p1.setPrice(75000);
		
		repo.save(p1);
		Product p2 = new Product();
		p2.setDescription("A Smart Mobile");
		p2.setPrice(50000);
		repo.save(p2);
		Product p3 = new Product();
		p3.setDescription("A Wifi Router");
		p3.setPrice(12000);
		repo.save(p3);
	}

}
