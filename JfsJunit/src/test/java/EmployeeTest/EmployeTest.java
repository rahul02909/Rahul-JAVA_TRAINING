package EmployeeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import Employee.*;
import org.junit.jupiter.api.Test;
import Product.*;
class  Employeetest {
	ProductBasicinfo pro=new ProductBasicinfo(1,"Oneplus",45000,"Nordblue");
	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Oneplus",pro.getProduct_name());
		
	}
	@AfterEach
	void test1() {
		assertNotEquals("blue",pro.getProduct_color());
		
	}
	@BeforeEach
	void test2() {
		assertNotEquals("1",pro.getProduct_id());
		
	}
	static EmployeeDat emp=new EmployeeDat(12,"Mohan","IT",50000);
	@AfterAll
	static void Emp() {
		//fail("Not yet implemented");
		assertEquals(12, emp.getEmpid());
		
	}

}