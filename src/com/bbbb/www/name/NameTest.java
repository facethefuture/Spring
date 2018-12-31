package com.bbbb.www.name;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class NameTest {
	
	@Test
	public void test(){
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		IName name = bf.getBean("name", IName.class);
		name.sayName();
	}
}

