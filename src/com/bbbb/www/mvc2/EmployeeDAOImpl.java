package com.bbbb.www.mvc2;

public class EmployeeDAOImpl implements IEmployeeDAO{
	private JdbcUtil jdbcUtil;
	public void setJdbcUtil(JdbcUtil jdbcUtil){
		this.jdbcUtil = jdbcUtil;
	}
	public void save(Employee e){
		jdbcUtil.getConnection();
		System.out.println("数据库save方法");
	}
}
