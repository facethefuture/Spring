package com.bbbb.www;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HellowTest {
	public static void main(String[] args){
		HellowWorld hw = new HellowWorld();
		hw.sayHello();
	}
	@Test
	public void HellowTest(){
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		IHellowWorld hellowWorld = bf.getBean("hellowworld",IHellowWorld.class);
		hellowWorld.sayHello();
	}
	
}
