package com.bbbb.www.mvc2;

import org.junit.Test;

public class EmployeeAction {
	private IEmployeeService service;
	private Employee employee;
	public void setService(IEmployeeService service){
		this.service = service;
	}
	public void setEmployee(Employee employee){
		this.employee = employee;
	}
	public void save(){
		Employee e = new Employee();
		service.save(e);

	}
	
}
