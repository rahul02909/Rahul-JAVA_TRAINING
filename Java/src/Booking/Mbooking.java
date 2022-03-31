package Booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Mbooking {
	public  static void book () throws SQLException
	{
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/booking";
		String username="root";
		String password="root";
		String query="Select * from Mbooking ";
		String query1="select * from Mbooking where Payment='UPI'";
		String query2="select * from Mbooking where Payment='COD'";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = MOVIE BOOKING DETAILS  = = = = = = = = = = = = = = = = = = = = = = = =");
		
		System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
		System.out.println("id"+"\t"+"Firstname"+"\t"+"Lastname"+"\t"+"Movie"+"\t"+"City"+"\t"+"\t"+"phone"+"\t"+"\t"+"Payment"+"\t"+"AmountPaid");
		System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("Firstname")+"\t"+"\t"+rs.getString("Lastname")
			+"\t"+"\t"+rs.getString("Movie")+"\t"+rs.getString("City")+"\t"+"\t"+rs.getString("Phone")+"\t"+rs.getString("Payment")+"\t"+rs.getFloat("AmountPaid"));
		}
		System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"----------"+"\t"+"-------"+"\t"+"----------\n");
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

		System.out.println("Enter the payment mode:\n");
		System.out.println("1.UPI\n");
		System.out.println("2.COD\n");
		System.out.print("TYPE HERE:");
		int s1=scan.nextInt();

		if(s1==1)
		{
		 rs=st.executeQuery(query1);
		  	System.out.println("= = = = = = = = = = = = = = = = = = = = = = UPI BOOKING DETAILS  = = = = = = = = = = = = = = = = = = = = = = = = =");
			System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
			System.out.println("id"+"\t"+"Firstname"+"\t"+"Lastname"+"\t"+"Movie"+"\t"+"City"+"\t"+"phone"+"\t"+"\t"+"Payment"+"\t"+"AmountPaid");
			System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
			
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("Firstname")+"\t"+"\t"+rs.getString("Lastname")
			+"\t"+"\t"+rs.getString("Movie")+"\t"+rs.getString("City")+"\t"+"\t"+rs.getString("Phone")+"\t"+rs.getString("Payment")+"\t"+rs.getFloat("AmountPaid"));
		}
		System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"----------"+"\t"+"-------"+"\t"+"----------\n");
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

		}
		if(s1==2)
		{
			 rs=st.executeQuery(query2);
			 	System.out.println("= = = = = = = = = = = = = = = = = = = = = = COD BOOKING DETAILS  = = = = = = = = = = = = = = = = = = = = = = = = =");
				System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
				System.out.println("id"+"\t"+"Firstname"+"\t"+"Lastname"+"\t"+"Movie"+"\t"+"City"+"\t"+"phone"+"\t"+"\t"+"Payment"+"\t"+"AmountPaid");
				System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
				
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("Firstname")+"\t"+"\t"+rs.getString("Lastname")
				+"\t"+"\t"+rs.getString("Movie")+"\t"+rs.getString("City")+"\t"+"\t"+rs.getString("Phone")+"\t"+rs.getString("Payment")+"\t"+rs.getFloat("AmountPaid"));
			}
			System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"----------"+"\t"+"-------"+"\t"+"----------\n");
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

		}
		System.out.println("\n");
		System.out.println("Enter the condition to filter the record: ");
		String s4=scan.next();
		System.out.println("\nEntered Query Condition is: "+s4);
		String query3="\nselect * from mbooking where "+s4;
		
		
		 rs=st.executeQuery(query3);
		 	System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
			System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
			System.out.println("id"+"\t"+"Firstname"+"\t"+"Lastname"+"\t"+"Movie"+"\t"+"City"+"\t"+"phone"+"\t"+"\t"+"Payment"+"\t"+"AmountPaid");
			System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"-----"+"\t"+"\t"+"-------"+"\t"+"----------");
			
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("Firstname")+"\t"+"\t"+rs.getString("Lastname")
			+"\t"+"\t"+rs.getString("Movie")+"\t"+rs.getString("City")+"\t"+"\t"+rs.getString("Phone")+"\t"+rs.getString("Payment")+"\t"+rs.getFloat("AmountPaid"));
		}
		System.out.println("--"+"\t"+"---------"+"\t"+"--------"+"\t"+"----"+"\t"+"--------"+"\t"+"----------"+"\t"+"-------"+"\t"+"----------\n");
		System.out.println(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		
		
		
		
		rs.close();
		st.close();
		con.close();
		scan.close();
		
		
		
		
		
	}
}
