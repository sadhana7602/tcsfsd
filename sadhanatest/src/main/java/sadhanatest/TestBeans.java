package sadhanatest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//context.registerShutdownHook();
		Object obj = context.getBean("circle");
		Circle c = (Circle)obj;
		double ar=c.area(4,1,7,8);
		System.out.println(ar);
		

	}
 
}