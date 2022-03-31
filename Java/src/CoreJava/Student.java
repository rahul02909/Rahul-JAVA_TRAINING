package CoreJava;


class StudentData{
	
	int sid;
	String name;
	String dept;
	int marks;
	
	public void display()
	{
		System.out.println( sid+"  "+ name+"  " + dept+"  " +marks  );	
	}
}
public class Student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData obj=new StudentData();
		StudentData obj1=new StudentData();
		StudentData obj2=new StudentData();
		obj.sid=1;
		obj.name="RAHUL";
		obj.dept="IT";
		obj.marks=55;
		obj.display();
		System.out.println("\n");
		obj1.sid=2;
		obj1.name="RAJA";
		obj1.dept="MECH";
		obj1.marks=66;
		obj1.display();
		System.out.println("\n");
		obj2.sid=3;
		obj2.name="RAM";
		obj2.dept="ECE";
		obj2.marks=77;
		obj2.display();
		System.out.println("\n");

	}
}
