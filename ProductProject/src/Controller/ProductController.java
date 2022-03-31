package Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.ProductClass;

public class ProductController {
	public List<ProductClass> findallProducts() throws ClassNotFoundException, SQLException{
		List<ProductClass> productList=new ArrayList<ProductClass>();
		String query="Select * from product_details";
		
		ResultSet resultset;
		 resultset=JdbcConnectionClass.getResultSet(query);
		while(resultset.next()) {
			System.out.println(resultset.getInt("product_id")+"\t\t"+resultset.getString("product_name")+"\t\t"+resultset.getFloat("product_price")+"\t\t"+resultset.getString("product_color"));
			
		}
		return productList;
	}
	public int save() throws ClassNotFoundException, SQLException {
		String query="insert into product_details(product_id,product_name,product_price,product_color)values(?,?,?,?)";
		int rows_inserted=0;
		   try {
			   rows_inserted=JdbcConnectionClass.saveRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   return rows_inserted;

		   
	}
	public void update() {
		String query=("update product_details set product_price=? where product_name=?");
		int rows_updated=0;
		   try {
			   rows_updated=JdbcConnectionClass.modifyRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
	}
	

}