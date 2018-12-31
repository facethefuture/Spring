package com.bbbb.www.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbbb.www.configPackage.ABeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ABeanConfig.class)
public class BeanTest {
	@Autowired
	private IABean aBean;
	@Autowired
	private ICBean c;
	@Autowired
	private IDBean d;
	@Test
	public void test(){
		aBean.play();
		say();
		d.work();
	}
	public void say(){
		c.say();
	}
}
