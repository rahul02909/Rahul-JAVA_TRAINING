package CoreJava;

import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		System.out.println("--------ADDED ELEMENTS---------");
		set.add(45);
		set.add(26);
		set.add(99);
		for(Integer i:set)
		{
			System.out.println(i);
		}
		set.remove(45);
		System.out.println("--------AFTER REMOVING 45---------");
		for(Integer i:set)
		{
			System.out.println(i);
		}
		set.add(66);
		set.add(77);
		set.add(88);
		System.out.println("--------AFTER ADDING 3 ELEMENTS---------");
		for(Integer i:set)
		{
			System.out.println(i);
		}
		System.out.println("--------CONTAINS METHOD---------");
		System.out.println("\n");
		int Check=77;
		System.out.println("CONTAINS  "+Check+" = "+set.contains(Check));
		System.out.println("\n");
		LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();
		set1.add(55);
		set1.add(32);
		set1.add(100);
		set1.add(44);
		set.addAll(set1);
		System.out.println("-----AFTER ADDING 2 SETS----");
		for(Integer i:set)
		{
			System.out.println(i);
		}

		System.out.println("--------BEFORE CLEAR--------");
		for(Integer i:set)
		{
			System.out.println(i);
		}
		set.clear();
		System.out.println("--------AFTER CLEAR---------");
		System.out.println("\n");
		for(Integer i:set)
		{
			System.out.println(i);
		}
		System.out.println("\n");
		System.out.println("-----------END-------------");	
	}
}
