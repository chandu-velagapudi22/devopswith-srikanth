package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/empname")
	public String getEmpName(Employee employee) {
		employee.setEmpName("Srikanth Reddy");
		System.out.println("***************");
		System.out.println("Employee name is::  " + employee.getEmpName());
		System.out.println("***************");
		return employee.getEmpName();

	}

	@GetMapping("/empsal")
	public String getEmpSal(Employee employee) {
		employee.setEmpSalary(50000.00);
		System.out.println("***************");
		System.out.println("Employee salary  is::  " + employee.getEmpSalary());
		System.out.println("***************");
		return employee.getEmpSalary().toString();

	}

	@GetMapping("/empid")
	public String getEmpId(Employee employee) {
		employee.setId(1234);
		System.out.println("***************");
		System.out.println("Employee id is::  " + employee.getId());
		System.out.println("***************");
		return employee.getId().toString();

	}

	@GetMapping("/empaddress")
	public String getEmpAddress(Employee employee) {
		employee.setEmpAddress("Hyderabad");
		System.out.println("***************");
		System.out.println("Employee address is::  " + employee.getEmpAddress());
		System.out.println("***************");
		return employee.getEmpAddress();

	}

	@GetMapping("/peremp")
	public Boolean getPerEmp(Employee employee) {
		employee.setPerEmp(true);
		System.out.println("***************");
		System.out.println("Employee is permenant::  " + employee.getPerEmp());
		System.out.println("***************");
		return employee.getPerEmp();

	}

	@GetMapping("/totaldata")
	public List<Employee> getAllData() {
		ArrayList<Employee> empData = new ArrayList<>();
		System.out.println("***************");
		empData.add(0, new Employee(12, "srikanth", "rayalasema", 50000.00, false));
		empData.add(1, new Employee(13, "chandu", "Khammam", 50000.00, true));
		System.out.println("***************");
		System.out.println("GET TOTAL DATA");
		empData.forEach(System.out::println);
		return empData;

	}
}
