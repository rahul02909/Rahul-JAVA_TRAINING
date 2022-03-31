package CoreJava;
import java.util.Scanner;
public class Activity2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("  Enter Details For Booking\n");
		System.out.println("-------------------------------------");
		System.out.print("\nEnter the name-------------->:");
		String s1=scan.next();
		System.out.print("Enter your Customer ID------>:");
		int r=scan.nextInt();
		System.out.print("Enter the City-------------->:");
		String d=scan.next();
		System.out.print("Enter the Booking ID-------->:");
		int b=scan.nextInt();
		System.out.print("Enter the Amount to pay----->:");
		float f=scan.nextFloat();
		if(f>1000)
		{
			System.out.println("-------------------------------------");
			System.out.println("\nPayment Successfull..BOOKING COMFIRMED....!");
			System.out.println("-------------------------------------");
			System.out.println("\n------------BOOKING DETAILS----------");
			System.out.println("==>NAME       :"+s1);
			System.out.println("==>ID         :"+r);
			System.out.println("==>CITY       :"+d);
			System.out.println("==>B-ID       :"+b);
			System.out.println("==>AMOUNT PAID:"+f);
			System.out.println("==>B-STATUS   :CONFIRMED");
			System.out.println("-------------------------------------");
		}
		else
			System.out.println("ERROR.!Payment Un-successfull..Try Again Later...!");
		System.out.println("-------------------------------------");
		System.out.print("Enter Any key(0-9) To Enter String Fuctions--->");
		int e=scan.nextInt();
		if(e>9)
			System.out.println("ENTER VALID KEY");
		else
		{
		    StringBuffer buf=new StringBuffer("BRING");
		    System.out.println("\nBefore Appending :"+buf);
		    buf.append(" WATER ");
		    System.out.println("\nAfter Appending  :"+buf);
		    System.out.println("\nBefore Insert    :"+buf);
		    buf.insert(12,"BOTTLE");
		    System.out.println("\nAfter Insert     :"+buf);
		    System.out.println("\nBefore Replacing :"+buf);
		    buf.replace(0, 5, "MY");
		    System.out.println("\nAfter Replacing  :"+buf);
		    StringBuilder str= new StringBuilder("polymorphism");
		    System.out.println("\nString           ="+ str);
		    StringBuilder rstr=str.reverse();
		    System.out.println("\nReversed String  ="+ rstr);
		    @SuppressWarnings("unused")
			StringBuilder rstd=str.reverse();
		    StringBuilder strd=str.delete(0, 4);
		    System.out.println("\nDeleted String   ="+strd);
		    int strl=strd.length();
		    System.out.println("\nLenght of String ="+strl);
		    System.out.println("-------------------------------------");
		}
		scan.close();
	}
}


