package CoreJava;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        for(int i=0;i<=5;i++)
        {
         System.out.println(a+i); 
        }
        System.out.println("........................");
        int j=1;
        while(j<=10)
        {
            System.out.println(2*j);
            j=j+1;
        }
        System.out.println("........................");
        int k=1;
        do
        {
          System.out.println(3*k);
          k=k+1;
        }while(k<=10);

	}

}
