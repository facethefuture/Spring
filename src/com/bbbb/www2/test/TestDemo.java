package com.bbbb.www2.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbbb.www2.concert.IPerformance2;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=com.bbbb.www2.config.JavaConfig.class)
@ContextConfiguration
public class TestDemo {
	@Autowired
	private IPerformance2 p;
	@Test
	public void test(){
		p.perform();
	}
}
