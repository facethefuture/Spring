package com.bbbb.www.name;

public class NameFactory {
	public static Name getObj(){
		Name name = new Name();
		name.init();
		return name;
	}
}
