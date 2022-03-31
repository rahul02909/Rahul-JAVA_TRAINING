package Jfs.ProductProjectUpdate;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Jfs.ProductProjectUpdateView.JdbcDriverClass;


public class App {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcDriverClass jdbc=context.getBean(JdbcDriverClass.class);
		jdbc.dummy();
		jdbc.display();
		
		
	}
	

}
