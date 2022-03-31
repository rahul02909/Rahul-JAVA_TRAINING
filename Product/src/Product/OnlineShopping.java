package Product;
import java.util.Scanner;

public class OnlineShopping extends ProductBasicinfo {
	void discount(ProductBasicinfo j) {
		if(j.product_id==200) {
			System.out.println("-------Discount available--------");
		}
		else {
			System.out.println("-------Sorry,Discount not available--------");	
			}
	}
		void color(ProductBasicinfo j) {
			if(j.product_color=="Blue") {
				System.out.println("---------Power Bank Available----- ");
				
			}
			else {
				System.out.println("-------Power Bank not available------ ");
				
			}
			
		}
		void payment() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Payment Details");
			System.out.println("1. Credit/Debit Card");
			System.out.println("2. UPI");
			int choice=scan.nextInt();
			switch(choice) {
				case 1:{
					
					System.out.println("Enter Card Number: ");
					int card_no=scan.nextInt();
					System.out.println("Enter Card Name: ");
					String card_name=scan.next();
					System.out.println("Enter cvv: ");
					int cvv=scan.nextInt();
					System.out.println("!!!Payment Success!!!");
					System.out.println("***Thanks For Purchasing***");
					break;
				}
				case 2:{
					System.out.println("Enter UPI App");
					System.out.println("1. Gpay");
					System.out.println("2.Paytm");
					int choice1=scan.nextInt();
					switch(choice1){
					case 1:
						System.out.println("Enter UPI Id: ");
						int upi_id=scan.nextInt();
						System.out.println("!!!Payment Success!!!");
						System.out.println("***Thanks For Purchasing***");
						break;
					case 2:
						System.out.println("Enter UPI Id: ");
						int upi_id1=scan.nextInt();
						System.out.println("!!!Payment Success!!!");
						System.out.println("***Thanks For Purchasing***");
						break;
						
						
					
					}
					break;
					
					
					
				}
				
			}
			scan.close();
		}
		
		
		
		
	}