package com.bbbb.www.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BeanTest {
	@Autowired
	ApplicationContext ctx;
	@Test
	public void test(){
		SomeBean sb = ctx.getBean("someBean",SomeBean.class);
		System.out.println(sb.toString());
	}
}
