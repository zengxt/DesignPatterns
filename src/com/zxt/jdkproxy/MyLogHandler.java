package com.zxt.jdkproxy;

import java.lang.reflect.Method;

public class MyLogHandler implements MyInvocationHandler {
	// 需要被代理的对象
	private Object target;

	public MyLogHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method m) {
		try {
			System.out.println("日志开始");
			m.invoke(target);
			System.out.println("日志结束");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
