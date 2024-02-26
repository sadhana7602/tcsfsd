package com.tcs.Exception;

public class TestFinally {
public static void main(String[] args) {
	System.out.println("before try,catch,finally....");
	try {
		System.out.println(10/2);
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("from finally..");
	}
	System.out.println("After finally...");
}
}
