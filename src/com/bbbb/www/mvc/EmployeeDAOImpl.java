package com.bbbb.www.mvc;

public class EmployeeDAOImpl implements IEmployeeDAO{
	public void save(Employee e){
		JdbcUtil.getInstance().getConnection();
		System.out.println("���ݿ�save����");
	}
}
