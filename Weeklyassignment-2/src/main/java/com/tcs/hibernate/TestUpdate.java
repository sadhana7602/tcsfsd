package com.tcs.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configure =new Configuration();
		configure =configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		System.out.println(factory);
		Session session =factory.openSession();
		System.out.println(session);
		Transaction transaction =session.beginTransaction();
		
		ArrayList<Transaction2> transactions = new ArrayList();
		ArrayList<Investor2> investors = new ArrayList();
		
		Transaction2 trn1=session.get(Transaction2.class, 1);
		Transaction2 trn2=session.get(Transaction2.class, 2);
		Transaction2 trn3=session.get(Transaction2.class, 3);
		Transaction2 trn4=session.get(Transaction2.class, 4);
		Transaction2 trn5=session.get(Transaction2.class, 5);
		transactions.add(trn1);
		transactions.add(trn2);
		transactions.add(trn3);
		transactions.add(trn4);
		transactions.add(trn5);
		
		
		Investor2 inv1 =session.get(Investor2.class, 1);
		Investor2 inv2 =session.get(Investor2.class, 2);
		Investor2 inv3 =session.get(Investor2.class, 3);
		Investor2 inv4 =session.get(Investor2.class, 4);
		Investor2 inv5 =session.get(Investor2.class, 5);
		
		investors.add(inv1);
		investors.add(inv2);
		investors.add(inv3);
		investors.add(inv4);
		investors.add(inv5);
		
		
		for(Investor2 i:investors) {
		
		double bal1=0.0;
			for(Transaction2 t:transactions) {
				if(i.getId()==t.getInvestorId()) {
					bal1=i.getAmount()-t.getTranAmount();
				}
			}
			i.setAmount(bal1);
			session.update(i);
			
		}
		
		
       	
		
		
		
		
		
		transaction.commit();
		session.close();

	}

}
