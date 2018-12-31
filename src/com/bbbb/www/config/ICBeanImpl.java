package com.bbbb.www.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ICBeanImpl implements ICBean{
	private IABean a;
	@Autowired
	public ICBeanImpl(IABean a){
		this.a = a;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		a.play();
	}

}
