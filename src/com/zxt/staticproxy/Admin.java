package com.zxt.staticproxy;

/**
 * 
 * @Description: 真实的主题类
 *
 * @author： zxt
 *
 * @time: 2018年7月7日 下午2:31:21
 *
 */
public class Admin implements Manager {

	@Override
	public void doSomething() {
		System.out.println("这是真实的主题类：Admin doSomething!!!");
	}
}
