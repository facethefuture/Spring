package com.bbbb.www.mvc;

public class JdbcUtil {
	//����ģʽ   static���ο�����jvm����ʱ�ͼ��ؽ��������������һ���������Ұ������Ϊ����ʵ���������
	private static JdbcUtil instance = new JdbcUtil();
	private JdbcUtil(){
		System.out.println("��ʼ��datasource");
	}
	public static JdbcUtil getInstance(){
		return instance;
	}
	public void getConnection(){
		System.out.println("�õ����ݿ�����");
	}
}
