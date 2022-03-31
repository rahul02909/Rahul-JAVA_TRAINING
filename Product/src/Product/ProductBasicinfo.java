package Product;

public class ProductBasicinfo {
	int product_id;
	String product_name;
	float product_price;
	String product_color;
	public ProductBasicinfo() {}
	public ProductBasicinfo(int product_id, String product_name, float product_price, String product_color) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_color = product_color;
	}
	public int getProduct_id() {
		return product_id;
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
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_color() {
		return product_color;
	}
	public void setProduct_color(String product_color) {
		this.product_color = product_color;
	}
	@Override
	public String toString() {
		return "ProductBasicinfo [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_color=" + product_color + "]";
	}
	
	

}
