package com.bbbb.www.mvc;

public class EmployeeServiceImpl implements IEmployeeService{
	private IEmployeeDAO dao;
	public EmployeeServiceImpl(){
		dao = new EmployeeDAOImpl();
	}
	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("��һЩ�����ҵ���߼�����");
		dao.save(e);
		
	}

}
