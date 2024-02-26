package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		context.registerShutdownHook();
		Object obj = context.getBean("b");
		B b = (B)obj;
		b.other();
		C c=(C) context.getBean("c");
		c.other();
		boolean result=context.isPrototype("a");
		System.out.println(result);

	}
 
}