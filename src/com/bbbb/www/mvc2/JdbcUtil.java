package com.bbbb.www.mvc2;

public class JdbcUtil {
//	//单例模式   static修饰可以在jvm运行时就加载进虚拟机，这样第一个请求的人野不会因为创建实例而变得慢
//	private static JdbcUtil instance = new JdbcUtil();
//	private JdbcUtil(){
//		System.out.println("初始化datasource");
//	}
//	public static JdbcUtil getInstance(){
//		return instance;
//	}
	public void init(){
		System.out.println("初始化datasource");
	}
	public void getConnection(){
		System.out.println("得到数据库连接");
	}
}
