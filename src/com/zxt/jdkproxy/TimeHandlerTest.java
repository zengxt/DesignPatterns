package com.zxt.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.zxt.staticproxy.Car;
import com.zxt.staticproxy.Moveable;

/**
 * 
 * @Description: JDK动态代理的测试类
 *
 * @author： zxt
 *
 * @time: 2019年3月1日 下午7:59:29
 *
 */
public class TimeHandlerTest {

	public static void main(String[] args) {
		// 需要被代理的对象
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		
		Class<?> clazz = car.getClass();
		
		/**
		 * 参数一：类加载器
		 * 参数二：被代理类实现的接口
		 * 参数三：InvocationHandler实例
		 * 
		 * 函数返回：返回由InvocationHandler接口接收的被代理类的一个动态代理类对象
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), h);
		m.move();
	}

}
