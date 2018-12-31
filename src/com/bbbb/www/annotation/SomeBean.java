package com.bbbb.www.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBean {
	private OtherBean otherBean;
	@Autowired
	public void setOtherBean(OtherBean otherBean){
		this.otherBean = otherBean;
	}
	public String toString(){
		System.out.println(otherBean);
		return "someBean" + otherBean;
	}
}
