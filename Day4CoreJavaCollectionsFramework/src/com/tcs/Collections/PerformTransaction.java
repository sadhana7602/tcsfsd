package com.tcs.Collections;

import java.util.HashSet;

public class PerformTransaction {
	public static void main(String[] args) {
		
		
		
	    
	
	
		
		Transaction t1= new Transaction(101,"01-89",5000,1);
		Transaction t2= new Transaction(102,"02-89",7000,2);
		Transaction t3= new Transaction(103,"03-89",1000,3);
		Transaction t4= new Transaction(104,"04-89",25000,4);
		Transaction t5= new Transaction(105,"05-89",85000,5);
		
		CacheTransactions it= new CacheTransactions();
		it.addTransaction(t1);
		it.addTransaction(t2);
		it.addTransaction(t3);
		it.addTransaction(t4);
		it.addTransaction(t5);
		
		//it.showTransaction();
		
		
		System.out.println(it.updateTransaction(170000, 101));
		
	}

}
