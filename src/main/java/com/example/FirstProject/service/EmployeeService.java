package com.example.FirstProject.service;

import com.example.FirstProject.model.Employee;

interface EmployeeService {

	public String addEmployee();
	public String updateEmployee();
	public String deleteEmployee();
	public Employee findEmployee();
	public Employee displayAllEmployee();
}
