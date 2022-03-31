package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("**********Welcome to Online Shopping**********");
		System.out.println("======Enter the Product Details========");
		char choice;
		List<ProductBasicinfo> prod=new ArrayList<ProductBasicinfo>();
		OnlineShopping os=new OnlineShopping();
		
		do{
			System.out.println("Enter ProductId: ");  
			int product_id=scan.nextInt();
			System.out.println("Enter ProductName: ");
			String product_name=scan.next();
			System.out.println("Enter Product Price: ");
			float product_price=scan.nextFloat();
			System.out.println("Enter Product Color: ");
			String product_color=scan.next();
			prod.add(new ProductBasicinfo (product_id,product_name,product_price,product_color));
			System.out.println("Want to add more press(Y or y):");
			choice=scan.next().charAt(0);
		  }while(choice=='Y'||choice=='y');
		
		for(ProductBasicinfo i:prod) {
		System.out.println("Product Id:"+i.product_id);
		for(ProductBasicinfo j:prod) 
		{
			os.discount(j);
			os.color(j);
			os.payment();
		}
		}

			
		}

		
		//System.out.println(obj);
		}

