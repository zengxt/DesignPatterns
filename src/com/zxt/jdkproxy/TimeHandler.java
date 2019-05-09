package com.zxt.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	// 被传递过来的要被代理的对象
	private Object object;
	
	public TimeHandler(Object object) {
		super();
		this.object = object;
	}

	/**
	 * proxy：被代理的对象
	 * method：被代理的方法
	 * args：被代理方法的参数
	 * 
	 * 函数返回：method的返回
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车行驶前----");
		method.invoke(object, args);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶结束----行驶时间为：" + (endTime - startTime) + "毫秒！");
		return null;
	}
}
