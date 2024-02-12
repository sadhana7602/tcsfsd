package com.tcs.javaconfig;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class TestBean {
	@Autowired
	public static void main(String[] args) {
		ApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hello=(HelloWorld) ctxt.getBean("helloBean");
		System.out.println(hello.message());
		
		HelloService service = (HelloService) ctxt.getBean("helloservice");
		service.callHello();
	}
 
}