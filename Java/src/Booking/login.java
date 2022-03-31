package Booking;
import java.sql.SQLException;
import java.util.Scanner;
public class login {

	public static void main(String[] args) throws SQLException {
		Scanner scan=new Scanner(System.in);
		System.out.println("\n=========BOOKING DETAILS=========");
		System.out.println("\n   1.HOTEL BOOKING");
		System.out.println("\n   2.MOVIE BOOKING");
		System.out.println("\n   3.   EXIT");
		System.out.print("\nEnter your Choice:");
		int c=scan.nextInt();
		System.out.println("\n");
		switch(c)
		{
		case 1:if(c==1)	
		{
			Hbooking.book();
			break;
		}
		case 2:if(c==2)
		{
			Mbooking.book();
			break;
		}
		case 3:if(c==3)
		{
			System.out.println("Thank You For Choosing Our Booking Details App");
			break;
		}
		default:
		{
			System.out.println("Enter valid input....!");
		}
		}
		scan.close();
	}
}
