package com.bbbb.www.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbbb.www.concert.IAudience;
import com.bbbb.www.concert.ICustomer;
import com.bbbb.www.performance.IPerformance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.bbbb.www.configPackage.BeanConfig.class)
public class AopTest {
//	@Autowired
//	private IAudience audient;
	@Autowired
	private IPerformance p;
	@Autowired
	private ICustomer c;
	@Test
	public void test(){
		p.perform(0);
		c.buy();
	}
}
