package com.zxt.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();
	
	// 得到代理类的方法
	public Object getProxy(Class<?> clazz) {
		// 设置创建子类的类  （即我们需要为哪个类产生代理类）
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}
	
	/**
	 * 拦截所有目标类方法的调用
	 * 
	 * object：目标类的实例
	 * method：目标类的目标方法的反射实例
	 * args：目标方法的参数
	 * proxy：代理类的实例
	 */
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("火车行驶前----");
		
		// 代理类调用父类的方法 (由于Cglib动态代理的实现是通过继承被代理类，因此代理类这里需要调用父类的方法)
		proxy.invokeSuper(object, args);
		
		long endTime = System.currentTimeMillis();
		System.out.println("火车行驶结束----行驶时间为：" + (endTime - startTime) + "毫秒！");
		return null;
	}

}
