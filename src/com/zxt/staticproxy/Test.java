package com.zxt.staticproxy;

public class Test {

	public static void main(String[] args) {
		// 1、聚合方式的测试
		Admin admin = new Admin();
		Manager manager = new AdminPoly(admin);
		manager.doSomething();
		
		System.out.println("============================");
		// 2、继承方式的测试
		AdminProxy proxy = new AdminProxy();
		proxy.doSomething();
	}

}
