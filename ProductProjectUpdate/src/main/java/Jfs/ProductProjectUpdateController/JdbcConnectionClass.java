package Jfs.ProductProjectUpdateController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.stereotype.Component;

public class JdbcConnectionClass {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
		return connection;
	}
	//public static ResultSet getResultSet() throws SQLException, ClassNotFoundException {
//		Connection connection=getConnection();
//		Statement statement=connection.createStatement();
//		String query="select * from product_details";
//		ResultSet rs=statement.executeQuery(query);
//		while(rs.next()) {
//			System.out.println(rs.getInt("product_id")+"\t\t"+rs.getString("product_name")+"\t\t"+rs.getFloat("product_price")+"\t\t"+rs.getString("product_color"));
//			
//		}
		public static ResultSet getResultSet(String query) throws SQLException, ClassNotFoundException
		{
			Connection connection=getConnection();
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);
			return resultset;
			
			
		}
		public static int saveRecord(String query) throws ClassNotFoundException, SQLException {
			Connection connection=getConnection();
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Product Id:");
			pst.setInt(1, scan.nextInt());
			System.out.println("Enter the Prouct Name:");
			pst.setString(2,scan.next());
			System.out.println("Enter the Product Price:");
			pst.setFloat(3, scan.nextFloat());
			System.out.println("Enter the Product Color:");
			pst.setString(4,scan.next());
			int rows_inserted=pst.executeUpdate();
			System.out.println("Rows Inserted:"+rows_inserted);
			
			
			return rows_inserted;
		}
		public static int modifyRecord(String query) throws ClassNotFoundException, SQLException {
			Connection connection=getConnection();
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Product Price:");
			pst.setFloat(1,scan.nextFloat());
			System.out.println("Enter Product Name:");
			pst.setString(2,scan.next());
			int rows_updated=pst.executeUpdate();
			System.out.println("Rows Updated:"+rows_updated);
			
			return rows_updated;
			
		}

}
