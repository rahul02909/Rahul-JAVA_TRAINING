package JdbcCon;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConDemo {
	
	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/customer";
		String username="root";
		String password="root";
		String query="Select * from custdetails ";


		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		Time t,t1,t2,t3;

		System.out.println("id"+"\t"+"name"+"\t"+" number"+"\t"+"\t"+"Login_time"+"\t"+"Logout_time");
		
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");

		while(rs.next())
		{
			t=rs.getTime("login_time");
			t1=rs.getTime("logout_time");

		System.out.println(rs.getString("id")+"\t"+rs.getString("name")+"\t"+rs.getString("number")+"\t"+t+"\t"+t1);
		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		
		}

		System.out.println("--"+"\t"+"----"+"\t"+"------"+"\t"+"\t"+"----------"+"\t"+"-----------");
		System.out.println("\n");
		System.out.println("-------------------Displaying with Condition---------------------------");
		System.out.println("\n");
		
		String query1="Select * from custdetails where login_time='10:30:00'";
		
		System.out.println("id"+"\t"+"name"+"\t"+" number"+"\t"+"\t"+"Login_time"+"\t"+"Logout_time");
		rs=st.executeQuery(query1);
		
		while(rs.next())
		{
			
			t2=rs.getTime("login_time");
			t3=rs.getTime("logout_time");

		System.out.println(rs.getString("id")+"\t"+rs.getString("name")+"\t"+rs.getString("number")+"\t"+t2+"\t"+t3);
		}
		st.close();
		con.close();
	}
}
