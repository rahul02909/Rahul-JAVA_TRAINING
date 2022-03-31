package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookShopApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(BookShopApplication.class, args);
		Book book=context.getBean(Book.class);
		System.out.println("= = = = = = = = = = = = = = = = = = = = ");
		book.display();
		System.out.println("= = = = = = = = = = = = = = = = = = = = ");
		
		Book1 book1=context.getBean(Book1.class);
		book1.Collection();
		System.out.println("= = = = = = = = = = = = = = = = = = = = ");
		
		Discount dis=context.getBean(Discount.class);
		System.out.println("Discount Avaiability:");
		dis.discount();
		System.out.println("= = = = = = = = = = = = = = = = = = = = ");
	}

}
