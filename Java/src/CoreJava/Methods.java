package CoreJava;
public class Methods {
	public static int addition(int a,int b)
	{
	         return (a+b); 
	}
	public static int sub(int a,int b)
	{
	         return (a-b); 
	}
	public static int multiply(int a,int b)
	{
	         return (a*b); 
	}
	public static int divide(int a,int b)
	{
	         return (a/b); 
	}
	public static int mod(int a,int b)
	{
	         return (a%b); 
	}
	public static void view()
	{
	         int a=1000;
	         System.out.println(a);
	}
	public static void main(String[] args)
	{
		int j=addition(2,3);
		System.out.println(j);
		int k=sub(50,25);
		System.out.println(k);
		int l=multiply(10,10);
		System.out.println(l);
		int m=divide(160,4);
		System.out.println(m);
		int n=mod(367,3);
		System.out.println(n);
		view();
	}
}
