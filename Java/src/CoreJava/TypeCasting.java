package CoreJava;

public class TypeCasting {
	public static void main(String[] args) {
		float f=5.2365f;
		int c=5;
		System.out.println("Float:"+f);
		System.out.println("\nInt:"+c);
		float result=c+f;
		System.out.println("\nInt to Float:"+result);
		int i=c+(int)f;
		System.out.println("\nFloat to Int:"+i);
		System.out.println("-----------------------------");
		int a=15;
		double d=5.0;
		double s=a+d;
		int b=a+(int)d;
		System.out.println("\nInt:"+a);
		System.out.println("\ndouble:"+d);
		System.out.println("\nInt to Double:"+s);
		System.out.println("\nDouble to Int:"+b);
		System.out.println("-----------------------------");
		int e=27;
		System.out.println("\nInt:"+e);
		String s1=String.valueOf(e);
		System.out.println("\nInt to String:"+s1);
		System.out.println("-----------------------------");
	}

}
