package com.tcs.oops.encapsulation.statictest;

public class CreateInvestors {
	public static void main(String[] args) {
		
		/*//Investor i1= new Investor();
		//System.out.println(i1);
		Investor i1=new Investor(101, "sadhana", "Anna Salai,Chennai", 1000000);
		System.out.println(i1.getAmount());
		Investor i2=new Investor(101, "sadhana", "Anna Salai,Chennai");
		System.out.println(i2.getAmount());
		//
		//System.out.println(result);
		boolean result=i1.equals(i2);
		System.out.println(result);*/
		
		Investor i1=new Investor(101, "sadhana", "Anna Salai,Chennai", 1000000);
		System.out.println(Investor.getCount());
		Investor i2=new Investor(101, "sadh", "Anna Salai,Chennai",1000000);
		System.out.println(Investor.getCount());
		Investor i3=new Investor(101, "sadhan", "Anna Salai,Chennai", 1000000);
		System.out.println(Investor.getCount());
		Investor i4=new Investor();
		System.out.println(Investor.getCount());
		
		
	}

}
