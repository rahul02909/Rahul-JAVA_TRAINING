package ServiceImpl;

import java.util.HashSet;
import java.util.Set;

import Model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	private Set<Employee> employees= new HashSet<Employee>();

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
		
	}

	@Override
	public Set<Employee> employee() {
		// TODO Auto-generated method stub
		return employees;
	}

}
