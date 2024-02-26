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
public class Investor3 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String instrument;
	private double amount;
	@Override
	public String toString() {
		return "Invsetor3 [id=" + id + ", name=" + name + ", address=" + address + ", instrument=" + instrument
				+ ", amount=" + amount + "]";
	}
	
	
	

}
