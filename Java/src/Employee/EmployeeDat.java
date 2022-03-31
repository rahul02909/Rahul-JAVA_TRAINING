package Employee;

public class EmployeeDat {
	int empid;
	String empname;
	String qualification;
	double salary;
	EmployeeDat()
	{
		
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public EmployeeDat(int empid,String empname,String qualification,double salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.qualification=qualification;
		this.salary=salary;
		System.out.println("\n");
		System.out.println("EMPID:"+empid+"  "+"EMPNAME:"+empname+"  "+"QUALIFICATION:"+qualification+"  "+"SALARY:"+salary);
	}
	public EmployeeDat(String empname,String qualification,double salary,int empid)
	{
		System.out.println("\n");
		System.out.println("EMPID:"+empid+"  "+"EMPNAME:"+empname+"  "+"QUALIFICATION:"+qualification+"  "+"SALARY:"+salary);
	}
	public EmployeeDat(int empid,String empname,double salary)
	{
		System.out.println("\n");
		System.out.println("EMPID:"+empid+"  "+"EMPNAME:"+empname+"  "+"SALARY:"+salary);
	}

	}
