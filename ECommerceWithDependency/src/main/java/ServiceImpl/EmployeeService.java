package ServiceImpl;

import java.util.Set;

import Model.Employee;

public interface EmployeeService {
	
	void add(Employee employee);
	
	Set<Employee> employee();

}
