package com.zxt.staticproxy;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		// 先写日志，再计时
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
		
		System.out.println();
		// 先计时，再写日志
		CarLogProxy clp1 = new CarLogProxy(car);
		CarTimeProxy ctp1 = new CarTimeProxy(clp1);
		ctp1.move();
	}
}
