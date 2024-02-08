package com.tcs.oops;

public class CreateInventors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor i1= new Investor();//i1 is the reference to an object which willbe created in memory
		//at runtime
		//,which will be givesn a copy of all  data members of class
		i1.id=101;
		i1.name="sadhana";
		i1.address="Tambaram,Chennai";
		i1.amount=20000;
		
		System.out.println(i1);
		String str=i1.getClass().getName() + '@' + Integer.toHexString(i1.hashCode());
		System.out.println(str);

	}

}
