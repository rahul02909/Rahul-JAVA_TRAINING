package MySpringBootWeb;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JfsMySpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsMySpringBootWebApplication.class, args);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the product_ID     :");
		int product_ID=scan.nextInt();
		System.out.println("Enter the product_Name   :");
		String product_Name=scan.next();
		System.out.println("Enter the brand_Name     :");
		String brand_Name=scan.next();
		System.out.println("Enter the price          :");
		int price=scan.nextInt();
		System.out.println("Enter the stock_available:");
		int stock_available=scan.nextInt();
		
		Product product=new Product(product_ID,product_Name,brand_Name,price,stock_available);
		System.out.println(product);
	}

}
