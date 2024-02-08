package com.tcs.oops;

public class TestPrimitives {
	static void validate(byte b,short s) {
		b++;
	}
	static void validate(short s,byte b) {
		s++;
	}
	static void other(short s) {
		s++;
	}
	
    public static void main(String[] args) {
		
    	byte b=10;
    	final int i=31;
    	b=i;
    	//i=b;
    	//validate(b);
    	//other(b);//implicit widening
    	//short s=10;
    	//short sum =s+s;//byte,short convented to int resulting int
    	//int,long result long
    	//long,long result long
    	//long,float result float
    	//float ,double result double
    	long lg=2341;
    	float f=34.56f;
    	f=f+lg;
    	//error lg=f+lg;
    	double r=10/2.5;
    	//validate(10,10);//show error amquity error
    	byte by=10;
    	short sh=10;
    	validate(by,sh);//not showing error
    	
	}
}
