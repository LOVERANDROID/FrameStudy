package com.symbio.inspirus.weber.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reflect();
	}
	/**
	 * 没有构造函数的反射，有多个参数
	 * @return
	 */
	public static Object reflect(){
		ReflectServiceImpl object = null;
		try {
			object = (ReflectServiceImpl) Class.forName("com.symbio.inspirus.weber.reflect.ReflectServiceImpl").newInstance();
			Method method = object.getClass().getMethod("sayHello", new Class[]{String.class, int.class});
			method.invoke(object, "zhangsan", 20);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;	
	}
	
	/**
	 * 有构造函数的反射，有多个参数
	 * @return
	 */
	public static Object reflect2(){
		ReflectServiceImpl2 object = null;
		try {
			object = (ReflectServiceImpl2) Class.forName("com.symbio.inspirus.weber.reflect.ReflectServiceImpl2").getConstructor(new Class[]{String.class, int.class}).newInstance("Tom", 20);
			Method method = object.getClass().getMethod("sayHello");
			method.invoke(object);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
