package com.bbbb.www.name;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class NameTest2 {
	private IName name;
	@Autowired
	private BeanFactory factory;
	@Test
	public void test(){
		name = factory.getBean("name", IName.class);
		name.sayName();
	}
}
