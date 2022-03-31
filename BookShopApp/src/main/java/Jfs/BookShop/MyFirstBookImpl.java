package Jfs.BookShop;

import org.springframework.stereotype.Component;

@Component
public class MyFirstBookImpl implements MyFirstBookInterface {
	
	public void my1stBook() {
		// TODO Auto-generated method stub
		System.out.println("Im from Interface :implemented through MyFirstBookImpl Class");
	}

}
