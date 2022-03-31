package Booking;

import java.util.Scanner;

public class Bstatus {
	Scanner scan=new Scanner(System.in);
	Bstatus(){
		
	}
	public Bstatus(float f,String s1) {
		// TODO Auto-generated method stub

		System.out.println("Amount Received :"+f);
		if(f>2000)
		{
			StringBuilder str= new StringBuilder("confirmed");
			StringBuilder rstr=str.reverse();
			System.out.println("\n");
			System.out.println(rstr);
			System.out.println("\nTo Confirm your Booking Enter the Above code:");
			String s5=scan.next();
			String s2=rstr.toString();
			if(s5.equals(s2))
			{
				System.out.println("--------------------------------------");
				System.out.println("           BOOKING CONFIRMED          ");
				System.out.println("............ENJOY YOUR DAY....."+s1);
				System.out.println("Thank You For Choosing Our Booking App");
				System.out.println("--------------------------------------");
			}
			else
			{
				System.out.println("  Captcha Mismatch     ");
				System.out.println("Sorry.....Try Again...!");
			}

		}
		else
		{
			System.out.println("Booking status:In Progress");
		}
		
	}

}
