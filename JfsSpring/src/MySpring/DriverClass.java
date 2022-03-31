package MySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {

		
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		Book book=(Book) context.getBean("book");
		book.setPrice(5000);
		book.setYear(2021);
		
		book.BookDetails();
		
		System.out.println("-----------------------");
		
		Book book1=(Book) context.getBean("book");
		
		book1.BookDetails();

	}

}
