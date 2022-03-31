package Jfs.ProductProjectUpdateView;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import Jfs.ProductProjectUpdateController.*;
import Jfs.ProductProjectUpdateModel.*;
import Jfs.ProductProjectUpdateView.*;

@Component
public class JdbcDriverClass {
	
	char choice1;
	ProductController productController=null;
	Scanner scanner=new Scanner(System.in);
	public  JdbcDriverClass() {
	productController=new ProductController();
	
	
	}
	public void display() throws ClassNotFoundException, SQLException {
		do {
		System.out.println("Enter Your Choice");
		System.out.println("1.FindAllProducts");
		System.out.println("2.Add Product");
		System.out.println("3.Modify Project");
		System.out.println("4.Exit");
		
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			List<ProductClass> productList=productController.findallProducts();
			 for(ProductClass p: productList)
				 System.out.println(p);
			break;
		case 2:
			productController.save();
			break;
		case 3:
			productController.update();
			break;
		default:
			System.out.println("Enter Valid Input");
		}
		System.out.print("\nEnter y to perform another Function:");
		choice1=scanner.next().charAt(0);
		
		}while(choice1=='y'||choice1=='Y');
		

//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//		Connection c=JdbcConnectionClass.getConnection();
//		JdbcDriverClass view=new JdbcDriverClass();
//		view.display();
//		
//}

	
	}
	public void dummy() {
		// TODO Auto-generated method stub
		System.out.println("Bean Created");
		
	}
}


