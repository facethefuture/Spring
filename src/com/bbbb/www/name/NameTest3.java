package com.bbbb.www.name;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class NameTest3 {
	@Test
	public void test(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bbbb/www/name/NameTest2-context.xml");
		IName name = ctx.getBean("name", IName.class);
		name.sayName();
	}
	@Autowired
	private ApplicationContext act;
	@Test
	public void test2(){
		IName name = act.getBean("name", IName.class);
		IName name2 = act.getBean("name",IName.class);
		System.out.println(name == name2);
		name.sayHellow();
	}
}
