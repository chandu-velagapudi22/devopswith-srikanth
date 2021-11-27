package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {
	private Integer id;
	private String empName;
	private String empAddress;
	private Double empSalary;
	private Boolean perEmp;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String empName, String empAddress, Double empSalary, Boolean perEmp) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.perEmp = perEmp;
	}

}
