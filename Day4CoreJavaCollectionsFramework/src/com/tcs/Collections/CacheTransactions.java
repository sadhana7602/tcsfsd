package com.tcs.Collections;
import java.util.*;
public class CacheTransactions {
	
	Investor i1= new Investor(1,"abc","chennai",50000,"shares");
	Investor i2= new Investor(2,"def","cbe",10000,"bonds");
	Investor i3= new Investor(3,"yuj","ooty",70000,"deposit");
	Investor i4= new Investor(4,"nkjh","delhi",60000,"deposit");
	Investor i5= new Investor(5,"def","kovai",1090,"bonds");
	
	ArrayList<Investor> inv=new ArrayList<Investor>();
	inv.add(i1)
	ArrayList<Transaction> transactions=new ArrayList<Transaction>();
	
	public boolean addTransaction(Transaction t) {
		boolean flag= transactions.add(t);
		return flag;
	}
	
	public void showTransaction() {
	
		for(Transaction i:transactions) {
		System.out.println(i);
		}
		Iterator<Transaction> itr= transactions.iterator();
		while(itr.hasNext()) {
			Transaction t=itr.next();
			System.out.println(t);
		}
	}
	
	public Transaction updateTransaction(double tran,int id) {
		Transaction temp=null;
		for(Transaction i:transactions) {
			if(i.getTid()==id) {
				i.setTranAmount(tran);
				temp= i;
			}
		}
		return temp;
	}

}
