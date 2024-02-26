package com.tcs.rest.resource;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String description;
	private double price;
	
	
	@Override
	public String toString() {
		return this.pid+this.description+this.price;
	}

}
