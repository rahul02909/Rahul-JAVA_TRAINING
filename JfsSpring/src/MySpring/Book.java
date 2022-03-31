package MySpring;

public class Book {
	
	double price;
	String name;
	String Author;
	int year;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void BookDetails() {
		
		System.out.println("Name  :"+name);
		System.out.println("Author:"+Author);
		System.out.println("price :"+price);
		System.out.println("Year  :"+year);
		

		
	}

}
