package com.bbbb.www.name;

public class Name implements IName{
	private int age;
	private String nickname;
	public void sayName(){
		System.out.println("name");
	}
	public void sayHellow(){
		System.out.println("���");
	}
	public void init(){
		System.out.println("init����");
	}
	public void sayProperty(){
		System.out.println(age +nickname);
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setNickname(String name){
		this.nickname = name;
	}
	public String getNickname(){
		return this.nickname;
	}
}
