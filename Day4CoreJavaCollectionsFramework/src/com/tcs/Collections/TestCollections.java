package com.tcs.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		Investor i1= new Investor(1,"abc","chennai",50000,"shares");
		Investor i2= new Investor(2,"def","cbe",10000,"bonds");
		Investor i3= new Investor(3,"yuj","ooty",70000,"deposit");
		Investor i4= new Investor(4,"nkjh","delhi",60000,"deposit");
		Investor i5= new Investor(5,"def","kovai",1090,"bonds");
		
	HashSet<Investor> set =new HashSet<Investor>();
	set.add(i5);
	set.add(i4);
	set.add(i3);
	set.add(i2);
	set.add(i1);
	System.out.println(set);
	
	Iterator<Investor> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	ArrayList<Set<Investor>> list=new ArrayList<>();
	
	list.add(set);
	HashSet<Investor> set2=set;
	HashSet<Investor> set3=set;
	
	list.add(set2);
	list.add(set3);
	for(Set i:list) {
		
			System.out.println(i);
		
	}
	
	}
}
