package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInvestor {
			public static void main(String[] args) {
				Configuration configure =new Configuration();
				configure =configure.configure();
				SessionFactory factory=configure.buildSessionFactory();
				
				Session session =factory.openSession();
				
				Transaction transaction =session.beginTransaction();
				//create
				Investor2 in1=new Investor2(1,"sadhana","coimbatore",500000);
				Investor2 in2=new Investor2(2,"niharka","chn",200000);
				Investor2 in3=new Investor2(3,"sam","ooty",400000);
				Investor2 in4=new Investor2(4,"bhavya","kerala",300000);
				Investor2 in5=new Investor2(5,"john","hyd",550000);
				
				session.save(in1);
				session.save(in2);
				session.save(in3);
				session.save(in4);
				session.save(in5);
				transaction.commit();
				session.close();
				
			}
			}
