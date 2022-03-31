package mypkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import mypkg.model.Employee;
import mypkg.service.impl.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String add(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "add";
	}
	
	
	@GetMapping("/save")
	public String save(@ModelAttribute("employee") Employee employee)
	{
		employeeService.add(employee);
		return "list";
	}

}
