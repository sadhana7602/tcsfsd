package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
    A a;
    @Qualifier("a1")
    public void setA(A a) {
    	this.a=a;
    }
	public void other() {
		
		a.method();
	}
	@PostConstruct
	public void start() {
		System.out.println(getClass()+" init()");
	}
	@PreDestroy
	public void terminated() {
		
		System.out.println(getClass()+" destroy()");
	}
}
