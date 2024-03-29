package com.tcs.Collections;

import java.util.*;
import java.util.Map.Entry;
public class TestCollections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Investor> dataMap= new HashMap<>();
		
		Investor i1= new Investor(1,"abc","chennai",50000,"shares");
		Investor i2= new Investor(2,"def","cbe",10000,"bonds");
		Investor i3= new Investor(3,"yuj","ooty",70000,"deposit");
		Investor i4= new Investor(4,"nkjh","delhi",60000,"deposit");
		Investor i5= new Investor(5,"def","kovai",1090,"bonds");
		
        dataMap.put(i5.getId(), i5);
        dataMap.put(i4.getId(), i4);
        dataMap.put(i3.getId(), i3);
        dataMap.put(i2.getId(), i2);
        dataMap.put(i1.getId(), i1);
        
        System.out.println(dataMap.get(5));
        i5.setInstrument("shares");
        dataMap.put(i5.getId(), i5);
        System.out.println(dataMap.get(5));
        Set<Integer> keys=dataMap.keySet();
        Collection<Investor> values=dataMap.values();
        Set<Entry<Integer,Investor>> keyvalue = dataMap.entrySet();
        
        Iterator<Entry<Integer,Investor>> itr=keyvalue.iterator();
        while(itr.hasNext()) {
        	Entry<Integer,Investor> e=itr.next();
        	System.out.println(e.getKey()+" = "+e.getValue());
        }
	}

}
