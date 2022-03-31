package MySpEL;

public class Book1 {
 
	int book1Id;
	String bookname;

	public int getBook1Id() {
		return book1Id;
	}
	public void setBook1Id(int book1Id) {
		this.book1Id = book1Id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	@Override
	public String toString() {
		return "Book1 [book1Id=" + book1Id + ", bookname=" + bookname + "]";
	}
	
	public void display()
	{
		System.out.println("BOOK1 ID   :"+book1Id);
		System.out.println("BOOK1 NAME :"+bookname);
	}

	

	
	
}



