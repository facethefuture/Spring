package com.bbbb.www.mvc2;

public class JdbcUtil {
//	//����ģʽ   static���ο�����jvm����ʱ�ͼ��ؽ��������������һ���������Ұ������Ϊ����ʵ���������
//	private static JdbcUtil instance = new JdbcUtil();
//	private JdbcUtil(){
//		System.out.println("��ʼ��datasource");
//	}
//	public static JdbcUtil getInstance(){
//		return instance;
//	}
	public void init(){
		System.out.println("��ʼ��datasource");
	}
	public void getConnection(){
		System.out.println("�õ����ݿ�����");
	}
}
