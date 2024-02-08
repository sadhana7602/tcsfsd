package com.tcs.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
	public static void main(String[] args) {
		Configuration configure =new Configuration();
		configure =configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		System.out.println(factory);
		Session session =factory.openSession();
		System.out.println(session);
		Transaction transaction =session.beginTransaction();
		/*Employee emp =new Employee();
		emp.setEname("Sri");
		emp.setSal(9000);
		session.save(emp);
		transaction.commit();
		Employee emp =session.get(Employee.class, 1);
		System.out.println(emp);
		session.close();
		*/
		/*Employee emp =session.get(Employee.class, 1);
		emp.setSal(500000);
		session.update(emp);
		System.out.println(emp);*/
		
		/*Employee emp =session.get(Employee.class, 1);
		session.delete(emp);*/
		Query<Employee> query =session.createQuery("select e from Employee e");
		List<Employee>  list= query.list();
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		transaction.commit();
		session.close();
		
	}

}
