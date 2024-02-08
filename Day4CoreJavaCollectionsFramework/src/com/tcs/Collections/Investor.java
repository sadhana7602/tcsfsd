package com.tcs.Collections;

public class Investor implements Comparable<Investor>{

	int id;
	String name;
	String address;
	double amount;
	String instrument;
	
	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + ", instrument="
				+ instrument + "]";
	}
	public Investor(int id, String name, String address, double amount, String instrument) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
		this.instrument = instrument;
	}
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	@Override
	public int compareTo(Investor o) {
		// TODO Auto-generated method stub
		//a<b return -1
		//a>b return 1
				//a==b return 0
		if(this.id<o.getId()) {
			return -1;
		}
		else if(this.id>o.getId()) {
			return 1;
		}
		
		else {
			return 0;
		}
	}
	
	
	
}
