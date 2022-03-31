package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Discount {
	@Autowired
	Book book1;
	public void discount()
	{
		if((book1.price)<500)
		{
			System.out.println("---------------------------");
			System.out.println("*....Discount Avaiable....*");
			System.out.println("**....Get 2 days extra....**");
			System.out.println("---------------------------");
		}
		else
		{
			System.out.println("-----------------------");
			System.out.println("*..Discount Avaiable..*");
			System.out.println("------Buy 1 Get 1------");
			System.out.println("-----------------------");
		}
	}

}
