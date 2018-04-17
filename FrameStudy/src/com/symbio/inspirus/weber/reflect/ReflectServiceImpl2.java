package com.symbio.inspirus.weber.reflect;

public class ReflectServiceImpl2 {
	private String name;
	private int age;
	public ReflectServiceImpl2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void sayHello(){
		System.out.println("hello " + name + age);
	}
}
