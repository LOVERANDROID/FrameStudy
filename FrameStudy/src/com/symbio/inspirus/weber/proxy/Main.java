package com.symbio.inspirus.weber.proxy;

public class Main {
	public static void main(String agrs[]){
//		JdkProxyExample jdk = new JdkProxyExample();
//		HelloWorld proxy = (HelloWorld) jdk.getProxy(new HelloWorldImpl());
//		proxy.sayHello();
		
		CGLIBProxyExample cg = new CGLIBProxyExample();
		HelloWorldImpl2 hw = (HelloWorldImpl2) cg.getProxy(HelloWorldImpl2.class);
		hw.sayHello();
	}
	
}
