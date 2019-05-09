package com.zxt.adapter;

/**
 * 
 * @Description: 这是一个二接口的电源，无法直接给笔记本电脑供电。即这是已经存在的类（接口），但是无法被客户端直接使用，需要被适配
 *
 * @author： zxt
 *
 * @time: 2019年5月8日 下午9:05:37
 *
 */
public class GBTwoPlug {
	
	public void powerWithTwo() {
		System.out.println("使用二相电流供电！！！");
	}
}
