package MySpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
		Book1 b1=(Book1) context.getBean("b1");
		b1.toString();
		b1.display();
		Book2 b2=(Book2) context.getBean("b2");
		b2.display();
	}

}
