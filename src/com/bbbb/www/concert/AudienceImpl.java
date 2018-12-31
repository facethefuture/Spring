package com.bbbb.www.concert;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AudienceImpl implements IAudience{
	private int count;
	@Pointcut("execution(* com.bbbb.www.performance.PerformanceImpl.perform(int)) && args(count)")
    public void pointCut(int count){}
	@Before("pointCut(count)")
	public void keepScience(int count) {
		// TODO Auto-generated method stub
		System.out.println("表演前请保持安静");
		this.count = count+1;
		System.out.println(this.count);

	}
	@After("pointCut(count)")
	public void applaud(int count){
		System.out.println("表演结束，请鼓掌");
		this.count = this.count+1;
		System.out.println(this.count);
	}
}
