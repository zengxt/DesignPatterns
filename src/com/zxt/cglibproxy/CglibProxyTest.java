package com.zxt.cglibproxy;

public class CglibProxyTest {
	
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		Train train = (Train) cglibProxy.getProxy(Train.class);
		train.move();
	}
	
}
