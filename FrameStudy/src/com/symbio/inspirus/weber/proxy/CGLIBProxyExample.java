package com.symbio.inspirus.weber.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBProxyExample implements MethodInterceptor{
	public Object getProxy(Class cls){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(cls);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("�������Ƿ���ǰ");
		Object result = arg3.invokeSuper(arg0, arg2);
		System.out.println("�������Ƿ�����");
		return result;
	}
}
