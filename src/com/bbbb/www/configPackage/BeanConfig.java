package com.bbbb.www.configPackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackageClasses={com.bbbb.www.concert.IAudience.class,com.bbbb.www.performance.IPerformance.class})
@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

}
