package com.tcs.oops.encapsulation;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor i1=new Investor();
		i1.setId(101);
		i1.setName("sadhana");
		i1.setAddress("Thuraipakkam");
		i1.setAmount(200000);
		System.out.println(i1.getName());
		System.out.println(i1.getAddress());
		
		Investor i2=new Investor();
		i2.setId(102);
		i2.setName("sadha");
		i2.setAddress("Thuraipakkam");
		i2.setAmount(250000);
		
		
		System.out.println(i1);
		System.out.println(i2);
		boolean result =i1 ==i2;
		System.out.println(result);//false becoz different hashcode
		boolean result1 =i2 ==i2;
		System.out.println(result1);
		
		Investor i3=i1;
		//boolean r=i1=i3;
		
		i3=null;
		result=i1==i3;
		System.out.println(result);
		
		

	}

}
