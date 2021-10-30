package com.java.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
    
	@Id
	@Column(name="Empno")
	private int Employeeno;
	
	
	@Column(name="Empname")
	private String Employeename;
	
	
	@Column(name="EmpLoc")
	private String EmployeeLocation;
	
	
	@Column(name="EmpDept")
	private String EmployeeDepartment;
	public int getEmployeeno() {
		return Employeeno;
	}
	public void setEmployeeno(int employeeno) {
		Employeeno = employeeno;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public String getEmployeeLocation() {
		return EmployeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		EmployeeLocation = employeeLocation;
	}
	public String getEmployeeDepartment() {
		return EmployeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		EmployeeDepartment = employeeDepartment;
	}
	
	
	
}
