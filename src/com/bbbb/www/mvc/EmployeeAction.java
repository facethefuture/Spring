package com.bbbb.www.mvc;

import org.junit.Test;

public class EmployeeAction {
	private IEmployeeService service = new EmployeeServiceImpl();
	public void save(){
		Employee e = new Employee();
		service.save(e);

	}
	
}
