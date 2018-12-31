package com.bbbb.www.performance;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements IPerformance{
	public void perform(int count){
		System.out.println("±Ì—›¿≤¿≤¿≤");
	}
}
