package mypkg.service.impl;

import java.util.Set;

import mypkg.model.Employee;


public interface EmployeeService {
	
	void add(Employee employee);
	
	Set<Employee> employee();

}
