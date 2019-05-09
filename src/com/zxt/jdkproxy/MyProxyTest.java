package com.zxt.jdkproxy;

import com.zxt.staticproxy.Car;
import com.zxt.staticproxy.Moveable;

/**
 * 
 * @Description: 模拟JDK动态代理的实现
 *
 * @author： zxt
 *
 * @time: 2019年4月18日 下午3:44:58
 *
 */
public class MyProxyTest {
	
	public static void main(String[] args) throws Exception {
		// 需要被代理的对象
		Car car = new Car();
		MyInvocationHandler h = new MyLogHandler(car);
				
		Moveable m = (Moveable) MyProxy.newProxyInstance(Moveable.class, h);
		m.move();
	}

}
