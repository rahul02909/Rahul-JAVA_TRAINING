package View;
import java.sql.Connection;
import java.sql.SQLException;
import Controller.JdbcConnectionClass;

import java.util.List;
import java.util.Scanner;
import Controller.ProductController;
import Model.ProductClass;

public class JdbcDriverClass {
	ProductController productController=null;
	Scanner scanner=new Scanner(System.in);
public JdbcDriverClass() {
	productController=new ProductController();
	
	
}
	public void display() throws ClassNotFoundException, SQLException {
		System.out.println("Enter Your Choice");
		System.out.println("1.FindAllProducts");
		System.out.println("2.Add Product");
		System.out.println("3.Modify Project");
		System.out.println("4.Exit");
		
		int choice=scanner.nextInt();
		while(true) {
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
		
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection c=JdbcConnectionClass.getConnection();
		JdbcDriverClass view=new JdbcDriverClass();
		view.display();
		

	}

}