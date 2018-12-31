package com.bbbb.www.mvc;

public class EmployeeServiceImpl implements IEmployeeService{
	private IEmployeeDAO dao;
	public EmployeeServiceImpl(){
		dao = new EmployeeDAOImpl();
	}
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("做一些额外的业务逻辑操作");
		dao.save(e);
		
	}

}
