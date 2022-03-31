package CoreJava;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("-----------------");
		int even[]=new int[5];
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			even[i]=i*2;
			System.out.println("Even number:"+even[i]);
		}
		System.out.println("-----------------");
		int odd[]=new int[5];
		odd[0]=1;
		odd[1]=3;
		odd[2]=5;
		odd[3]=7;
		odd[4]=9;
		for(int i=0;i<5;i++)     
		{
			System.out.println("Odd Number:"+odd[i]);
		}
		System.out.println("-----------------");
		int prime[]= {2,3,5,7,9,11,13,17,19};
		for(int i=0;i<8;i++)
		{
		System.out.println("Prime number:"+prime[i]);
		}
		System.out.println("-----------------");
		System.out.println("Enter the number:");
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Scanned number:"+a[i]);
		}
		scan.close();
	}
}
