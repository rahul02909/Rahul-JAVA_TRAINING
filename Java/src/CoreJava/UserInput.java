package CoreJava;
import java.util.Scanner;
class EmployeeDetails
{
	public EmployeeDetails(int a,String s1,String s2,double d)
	{
		System.out.println("\n");
		System.out.println("EMPID:"+a+"  "+"EMPNAME:"+s1+"  "+"QUALIFICATION:"+s2+"  "+"SALARY:"+d);
		System.out.println("\n");
	}
}

public class UserInput {
	public static void main(String[] args) {
		System.out.println("Enter the Employee ID:" );
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Enter the Employee Name:" );
		String s1=scan.next();
		System.out.println("Enter the Employee Degree:" );
		String s2=scan.next();
		System.out.println("Enter the Employee Salary:" );
		Double d=scan.nextDouble();
		System.out.println("                    EMPLOYEE DEATILS ");
		@SuppressWarnings("unused")
		EmployeeDetails e1=new EmployeeDetails(a,s1,s2,d);
		System.out.println("Enter the Boolean value:" );
		Boolean b=scan.hasNext();
		System.out.println(b);
        scan.close();
	}
}
