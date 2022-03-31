package CoreJava;
public class StringBasic {

	public static void main(String[] args) {
	    StringBuffer sb=new StringBuffer("HELLO");
	    sb.append("World");
	    System.out.println("\nAfter Appending:"+sb);
	    sb.insert(10,"Program");
	    System.out.println("\nAfter Insert   :"+sb);
	    sb.delete(2, 5);
	    System.out.println("\nAfter Deleting :"+sb);
	}

}
