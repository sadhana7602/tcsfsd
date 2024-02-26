package com.tcs.training;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.starting point
		//2.condition
		//3.statement
		//4.direction
		//5.termination
		int start =1;
		int stop= 100;
		while(start <= stop) {
			System.out.println("Run="+start);
			start++;
		}
		for(start=1;start<=stop;start++) 
		{
			System.out.println("Run = "+start);
		}
		start=0;
		for(stop=100;stop>=start;stop--) {
			System.out.println("Run = "+stop);
		}
		stop=100;
		for(start=1;start<=stop/2;start++) 
		{
			System.out.println("Run = "+start);
		}
		for(start=1;start<=stop;start+=2) 
		{
			System.out.println("Run = "+start);
		}
		int sum=0;
	
		for(int i=1;i<100;i+=3) {
		
			for(int j=i;j<i+3;j++) {
				sum=sum+j;
			}
			System.out.println(sum);
			sum=0;
		}
		//body not mandatory for "for loop"
		
		int i=0;
		for(i=0;i<=20;i++);{
			System.out.println(i);
		}
		double amount=1000000;
		for( i=1;i<=25;i++) {
			amount=amount+(0.13*amount);
		}
		
		System.out.println(amount);
	}

}
