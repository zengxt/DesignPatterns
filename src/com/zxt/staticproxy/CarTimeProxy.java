package com.zxt.staticproxy;

public class CarTimeProxy implements Moveable {
	private Moveable m;
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车行驶前----");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶结束----行驶时间为：" + (endTime - startTime) + "毫秒！");
	}
}
