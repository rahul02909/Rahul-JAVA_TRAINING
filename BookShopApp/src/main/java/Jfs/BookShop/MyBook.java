package Jfs.BookShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
	
	@Autowired
	MyFavBook myFavBooks;
	@Autowired
	MyFirstBookImpl myFirstBookImpl;
	@Autowired
	@Qualifier("myFavBook")
	MyFirstBookInterface myFirstBookInterface;

	public MyFavBook getMyFavBooks() {
		return myFavBooks;
	}

	public void setMyFavBooks(MyFavBook myFavBooks) {
		this.myFavBooks = myFavBooks;
	}
	
	public void displayMyBook()
	{
		System.out.println("My Book name is: JAVA 17");
		myFavBooks.myFavbk();
		myFavBooks.my1stBook();
		myFirstBookImpl.my1stBook();
		myFirstBookInterface.my1stBook();
		
	}
	
	public Integer Count() {
		Integer Count=100;
		return Count;
		
	}

}
