package mypkg.service.impl;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;
import mypkg.model.Employee;



@Service
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