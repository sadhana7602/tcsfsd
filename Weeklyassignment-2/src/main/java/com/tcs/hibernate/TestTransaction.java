package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTransaction {
	public static void main(String[] args) {
		Configuration configure =new Configuration();
		configure =configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		
		Session session =factory.openSession();
		
		Transaction transaction =session.beginTransaction();
		
		Transaction2 t1= new Transaction2(101,"01-89",5000,1);
		Transaction2 t2= new Transaction2(102,"02-89",7000,2);
		Transaction2 t3= new Transaction2(103,"03-89",1000,3);
		Transaction2 t4= new Transaction2(104,"04-89",25000,4);
		Transaction2 t5= new Transaction2(105,"05-89",85000,5);
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(t5);
		
		transaction.commit();
		session.close();
	}

}
