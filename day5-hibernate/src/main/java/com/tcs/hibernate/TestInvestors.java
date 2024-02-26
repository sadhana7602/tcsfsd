package com.tcs.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class TestInvestors {
		public static void main(String[] args) {
			Configuration configure =new Configuration();
			configure =configure.configure();
			SessionFactory factory=configure.buildSessionFactory();
			//System.out.println(factory);
			Session session =factory.openSession();
			//System.out.println(session);
			Transaction transaction =session.beginTransaction();
			//create
			Investor in=new Investor();
			in.setName("kavitha");
			in.setId(2);
			in.setAmount(500000);
			in.setAddress("chennai");
			System.out.println(in);
			session.save(in);
			transaction.commit();
			session.close();
			

}
}