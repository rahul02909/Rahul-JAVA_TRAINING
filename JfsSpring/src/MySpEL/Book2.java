package MySpEL;

public class Book2 {
	
	int book2Id;
	String bookname;
	public int getBook2Id() {
		return book2Id;
	}
	public void setBook2Id(int book2Id) {
		this.book2Id = book2Id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public void display()
	{
		System.out.println("BOOK2 ID   :"+book2Id);
		System.out.println("BOOK2 NAME :"+bookname);
	}


	
}
