package JdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public  class InsertDataByMethods {

	char choice;
	public static PreparedStatement pt;
	public static String s1;
	public static String s2;
	public static String s3;
	public static String s4;
	public void insert() throws SQLException
	{
		Scanner scan=new Scanner(System.in);
		
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
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;

		}while(choice=='y'||choice=='Y');
		
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		
		String url="jdbc:mysql://localhost:3306/dummy";
		String username="root";
		String password="root";
		
		
		Scanner scan=new Scanner(System.in);

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		

		InsertDataByMethods id=new InsertDataByMethods();
		String query="insert into details(name, phone,state,city) values (?,?,?,?)";
		id.insert();
		PreparedStatement pt=con.prepareStatement(query);
		pt.setString(1, s1);
		pt.setString(2, s2);
		pt.setString(3, s3);
		pt.setString(4, s4);
		
		int pst=pt.executeUpdate();
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		System.out.println("|id|"+"\t"+"|name|"+"\t"+"|phone|"+"\t"+"\t"+"| state  |"+"\t"+"|  city   |");
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		ResultSet rs=st.executeQuery("select * from details");
		while (rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("phone")+"\t"+rs.getString("state")+"\t"+"\t"+rs.getString("city"));
		}
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		
		System.out.println("=======================================================================");
		System.out.println("\n");
		System.out.println("-------------------INSERTION COMPLETED---------------------------------");
		System.out.println("\n");
		System.out.println("=======================================================================");
		
			

		scan.close();
		st.close();
		rs.close();
		pt.close();

	}

}
