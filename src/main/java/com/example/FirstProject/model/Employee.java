package com.example.FirstProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String EmpId;
	private String EmpName;
	private String EmpSal;
	private String EmpContact;
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(String empSal) {
		EmpSal = empSal;
	}
	public String getEmpContact() {
		return EmpContact;
	}
	public void setEmpContact(String empContact) {
		EmpContact = empContact;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + ", EmpContact=" + EmpContact
				+ "]";
	}
	public Employee(String empId, String empName, String empSal, String empContact) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSal = empSal;
		EmpContact = empContact;
	}
	public Employee() {
		super();
	}
	
	
	
	
}
