package CoreJava;
class EmployeeData
{
	int empid;
	String empname;
	String qualification;
	double salary;
	public EmployeeData(int id,String name,String degree,double sal)
	{
		this.empid=id;
		this.empname=name;
		this.qualification=degree;
		this.salary=sal;
		System.out.println("\n");
		System.out.println("EMPID:"+id+"  "+"EMPNAME:"+name+"  "+"QUALIFICATION:"+degree+"  "+"SALARY:"+sal);
		System.out.println("\n");
	}

	EmployeeData(int id,String name,double sal)
	{
		this.empid=id;
		this.empname=name;
		this.salary=sal;
		System.out.println("\n");
		System.out.println("EMPID:"+id+"  "+"EMPNAME:"+name+"  "+"SALARY:"+sal);
		System.out.println("\n");
	}
	public void display1()
	{
		System.out.println("EMPID:"+empid+"  "+"EMPNAME:"+empname+"  "+"SALARY:"+salary+"\n"+"\nPUBLIC METHOD");
	}

}
public class Employee {
	public static void main(String[] args) {

		System.out.println("                    EMPLOYEE DEATILS ");
		@SuppressWarnings("unused")
		EmployeeData e1=new EmployeeData(1001,"RAM","ECE",25000);
       EmployeeData e5=new EmployeeData(1005,"PREM",40000);
        e5.display1();
	}
}
