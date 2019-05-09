package com.zxt.adapter;

/**
 * 
 * @Description: 二相插座的适配器类，使得二相插座能够满足客户端的需求为三相电源供电
 *
 * @author： zxt
 *
 * @time: 2019年5月8日 下午9:12:50
 *
 */
public class TwoPlugAdapter implements ThreePlugInterface {
	// 使用组合的方式实现适配器类
	private GBTwoPlug twoPlug;
	
	public TwoPlugAdapter(GBTwoPlug twoPlug) {
		this.twoPlug = twoPlug;
	}

	@Override
	public void powerWithThree() {
		System.out.print("组合的方式实现适配器类：");
		twoPlug.powerWithTwo();
	}
}
