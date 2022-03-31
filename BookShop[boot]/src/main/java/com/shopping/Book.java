package com.shopping;

import org.springframework.stereotype.Component;

@Component
public class Book {
	int bookid=1;
	String name="Cricket World Cup: The Indian Challenge";
	String author="Ashis Ray";
	int price=1000;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	public void display()
	{
		System.out.println("***BOOK DETAILS***");
		System.out.println("BOOK ID   :"+bookid);
		System.out.println("BOOK NAME :"+name);
		System.out.println("AUTHOR    :"+author);
		System.out.println("BOOK PRICE:"+price);
	}

	


}
