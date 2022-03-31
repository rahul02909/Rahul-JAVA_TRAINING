package Employee;
public class EmployeeMain{
public static void main(String[] args) 
{
	EmployeeDat[] empdat=new EmployeeDat[4];
	EmployeeDat dat=new EmployeeDat();
			dat.empid=1231;
			dat.empname="Rahul";
			dat.qualification="IT";
			dat.salary=50000;	
			System.out.println("-----------ARRAY ELEMENTS-----------");
			empdat[0]=new EmployeeDat(698,"NANDHA",50000);
			empdat[1]=new EmployeeDat(123,"RAM",30000);
			empdat[2]=new EmployeeDat("JAFF","IT",50000,3695);
			empdat[3]=new EmployeeDat(6980,"RAVI",90000);
			@SuppressWarnings("unused")
			EmployeeDat dat1=new EmployeeDat("Ram", "IT", 70000,2135);
			@SuppressWarnings("unused")
			EmployeeDat dat2=new EmployeeDat(2135,"Raj",20000);
			Employeedat1 data=new Employeedat1();
			data.display(dat);
	}
}
