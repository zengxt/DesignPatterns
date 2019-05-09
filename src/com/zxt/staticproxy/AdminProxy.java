package com.zxt.staticproxy;

/**
 * 
 * @Description: 继承方式实现代理
 *
 * @author： zxt
 *
 * @time: 2018年7月7日 下午2:40:39
 *
 */
public class AdminProxy extends Admin {
	
	@Override
	public void doSomething() {
		System.out.println("继承方式实现代理：Admin操作开始！！");
		super.doSomething();
		System.out.println("继承方式实现代理：Admin操作结束！！");
	}
}
