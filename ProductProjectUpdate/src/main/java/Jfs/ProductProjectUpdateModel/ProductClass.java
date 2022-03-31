package Jfs.ProductProjectUpdateModel;


public class ProductClass {
	
	
	int product_id;
	String product_name,product_color;
	String product_price;
	public ProductClass() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public ProductClass(int product_id, String product_name, String product_color, float product_price) {
//		super();
//		this.product_id = product_id;
//		this.product_name = product_name;
//		this.product_color = product_color;
//		this.product_price = product_price;
//	}
//	public int getProduct_id() {
//		return product_id;
//	}
	public ProductClass(int product_id, String product_name, String product_color, String product_price) {
	super();
	this.product_id = product_id;
	this.product_name = product_name;
	this.product_color = product_color;
	this.product_price = product_price;
}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_color() {
		return product_color;
	}
	public void setProduct_color(String product_color) {
		this.product_color = product_color;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "ProductClass [product_id=" + product_id + ", product_name=" + product_name + ", product_color="
				+ product_color + ", product_price=" + product_price + "]";
	}

}
