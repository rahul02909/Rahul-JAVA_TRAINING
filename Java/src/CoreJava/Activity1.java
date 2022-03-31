package CoreJava;

public class Activity1 {
	public static void even()
	{
		int a=15;
		if(a%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		System.out.println("..............................");
	}
	public static void profile()
	{
		System.out.println("..............................");
		String s1="RAHUL";
		String s2="21";
		String s3="29/09/200";
		String s4="MALE";
		String s5="CHENNAI";
		System.out.println("  PROFILE  ");
		System.out.println("NAME  :"+s1); 
		System.out.println("AGE   :"+s2); 
		System.out.println("DOB   :"+s3); 
		System.out.println("GENDER:"+s4); 
		System.out.println("CITY  :"+s5); 
		System.out.println("..............................");
		
	}
	public static void loop()
	{
		int i,b=5,d,e;
		for(i=0;i<=5;i++)
		{
			d=b+i;
            System.out.println("d="+d);
            e=b-i;
            System.out.println("e="+e);
		}
		System.out.println("..............................");
	}
	public static int mod(int f,int j)
	{
		return(f%j);
	}

	public static void main(String[] args) {
		System.out.println("..............................");
		System.out.println("      Executing main method       ");
		System.out.println("..............................");
		int k=mod(366,3);
		System.out.println("Modulus value="+k);
		profile();
		loop();
		even();
	}

}
