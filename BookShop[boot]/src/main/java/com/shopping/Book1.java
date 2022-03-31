package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book1 {
	@Autowired
	Book book;
	
	public void Collection()
	{
		String s="APJ Abdul Kalam";
		if((book.author).contains(s))
		{
		System.out.println("========================================================================");
		System.out.println("--------APJ Abdul Kalam Written Other books Avaiable-------------------");
		System.out.println("========================================================================");
		System.out.println("-->India 2020: A Vision for the New Millennium (A P J Abdul Kalam, Y. S. Rajan)\r\n"
				+ "-->Wings of Fire: An Autobiography (A P J Abdul Kalam, Arun Tiwari)\r\n"
				+ "-->Ignited Minds: Unleashing the Power Within India (A P J Abdul Kalam)\r\n"
				+ "-->The Luminous Sparks (A P J Abdul Kalam)\r\n"
				+ "-->Mission India (A P J Abdul Kalam, Paintings by Manav Gupta)\r\n"
				+ "-->Inspiring Thoughts (A P J Abdul Kalam)");
		System.out.println("========================================================================");
		}
		else
		{
			System.out.println("---------------------------------");
			System.out.println("Other Author Collections Avaiable");
			System.out.println("---------------------------------");
		}
	}

	
	
	
	
	
	

}
