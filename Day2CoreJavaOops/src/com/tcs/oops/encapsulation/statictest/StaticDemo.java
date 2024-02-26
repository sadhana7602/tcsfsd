package com.tcs.oops.encapsulation.statictest;

public class StaticDemo {

	int data;//instance specfic
	static int item;//ststic memeber
	//nonstatic method
	void method() {
		data=10;
		item=30;
	}
	static void operation() {
		//data =20;//non static cannot access inside static content
		
		
	}
	{
		System.out.println("inistaniation block");
	}
	static {
		System.out.println("static block");
	}
	
}
