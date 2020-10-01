package com.employee.model;

import net.logstash.logback.argument.StructuredArgument;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	
	public Employee(int employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@Override
	public String toString() {
		return "employee {\"employeeId\":" + employeeId + ", \"employeeName\":\"" + employeeName + "\", \"employeeAddress\":\""
				+ employeeAddress + "\"}";
	}
	public int String(StructuredArgument kv) {
		// TODO Auto-generated method stub
		return employeeId;
	}

}
