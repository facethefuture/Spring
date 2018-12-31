package com.bbbb.www.mvc2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EmployeeTest {
	@Autowired
	ApplicationContext ac;
	@Test
	public void test(){
		EmployeeAction ea = ac.getBean("employeeAction", EmployeeAction.class);
		ea.save();
	}


}
