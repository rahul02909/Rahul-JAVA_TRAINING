package JdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertdata {

	public static void main(String[] args) throws SQLException {

		String url="jdbc:mysql://localhost:3306/dummy";
		String username="root";
		String password="root";
		String query="insert into details(name, phone,state,city) values (?,?,?,?)";
		
		Scanner scan=new Scanner(System.in);

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		

		PreparedStatement pt=con.prepareStatement(query);
		
		char choice;
		
           //Insertion into databse
		
		do
		{
		System.out.print("\nEnter the name:");
		String s1=scan.next();
		System.out.print("\nEnter the Phone:");
		String s2=scan.next();
		System.out.print("\nEnter the State:");
		String s3=scan.next();
		System.out.print("\nEnter the City:");
		String s4=scan.next();
		System.out.print("\nEnter y to insert data:");
		choice=scan.next().charAt(0);		
		pt.setString(1, s1);
		pt.setString(2, s2);
		pt.setString(3, s3);
		pt.setString(4, s4);
		
		@SuppressWarnings("unused")
		int pst=pt.executeUpdate();
		
		}while(choice=='y'||choice=='Y');
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		System.out.println("|id|"+"\t"+"|name|"+"\t"+"|phone|"+"\t"+"\t"+"| state  |"+"\t"+"|  city   |");
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		ResultSet rs=st.executeQuery("select * from details");
		while (rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("phone")+"\t"+rs.getString("state")+"\t"+"\t"+rs.getString("city"));
		}
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		System.out.println("\n");
		
		System.out.println("=======================================================================");
		System.out.println("\n");
		System.out.println("-------------------INSERTION COMPLETED---------------------------------");
		System.out.println("\n");
		System.out.println("=======================================================================");
		System.out.println("\n");
	
		
		//Updation to database
		
		
		System.out.println("--------------------------Updation-------------------------------------");
		System.out.println("\n");
		String query2="update details set city=? where id=? ";
		PreparedStatement pt1=con.prepareStatement(query2);
		System.out.println("Enter the city:");
		pt1.setString(1, scan.next());
		System.out.println("Enter the id:");
		pt1.setInt(2,scan.nextInt());
		@SuppressWarnings("unused")
		int pst=pt1.executeUpdate();
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		System.out.println("|id|"+"\t"+"|name|"+"\t"+"|phone|"+"\t"+"\t"+"| state  |"+"\t"+"|  city   |");
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		ResultSet rs1=st.executeQuery("select * from details");
		while (rs1.next())
		{
			System.out.println(rs1.getInt("id")+"\t"+rs1.getString("name")+"\t"+rs1.getString("phone")+"\t"+rs1.getString("state")+"\t"+"\t"+rs1.getString("city"));
		}
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		System.out.println("\n");
		System.out.println("=======================================================================");
		System.out.println("\n");
		System.out.println("-------------------UPDATION COMPLETED---------------------------------");
		System.out.println("\n");
		System.out.println("=======================================================================");
		
		
		//Deletion to database
		
		
		System.out.println("--------------------------Deletion-------------------------------------");
		System.out.println("\n");
		String query3="delete from details where id=?;";
		PreparedStatement pt2=con.prepareStatement(query3);
		System.out.println("Enter the id:");
		pt2.setInt(1,scan.nextInt());
		pst=pt2.executeUpdate();
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		System.out.println("|id|"+"\t"+"|name|"+"\t"+"|phone|"+"\t"+"\t"+"| state  |"+"\t"+"|  city   |");
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		ResultSet rs2=st.executeQuery("select * from details");
		while (rs2.next())
		{
			System.out.println(rs2.getInt("id")+"\t"+rs2.getString("name")+"\t"+rs2.getString("phone")+"\t"+rs2.getString("state")+"\t"+"\t"+rs2.getString("city"));
		}
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		System.out.println("\n");
		System.out.println("=======================================================================");
		System.out.println("\n");
		System.out.println("-------------------DELETION COMPLETED---------------------------------");
		System.out.println("\n");
		System.out.println("=======================================================================");
		
		scan.close();
		st.close();
		rs.close();
		rs1.close();
		rs2.close();
		pt.close();
		pt1.close();
		pt2.close();
		
	}

}
