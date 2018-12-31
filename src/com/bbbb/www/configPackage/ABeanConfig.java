package com.bbbb.www.configPackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bbbb.www.config.IABean;

@Configuration
@ComponentScan(basePackageClasses={IABean.class})
public class ABeanConfig {

}
