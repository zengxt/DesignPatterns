package com.zxt.cglibproxy;

import java.util.Random;

// 不实现接口的被代理类
public class Train {
	
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("火车行驶中----");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
