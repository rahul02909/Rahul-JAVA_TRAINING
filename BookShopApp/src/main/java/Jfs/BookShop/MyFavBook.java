package Jfs.BookShop;

import org.springframework.stereotype.Component;

@Component

public class MyFavBook  implements MyFirstBookInterface {
	
	public void myFavbk()
	{
		System.out.println("JAVA PROGRAMMING");
	}

	public void my1stBook() {

		System.out.println("Im from interface : implemented through MyFavClass class");
		
		
	}

}
