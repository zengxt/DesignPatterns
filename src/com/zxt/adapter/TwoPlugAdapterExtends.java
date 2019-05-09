package com.zxt.adapter;

/**
 * 
 * @Description: 二使用继承的方式实现适配器
 *
 * @author： zxt
 *
 * @time: 2019年5月8日 下午9:12:50
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugInterface {

	@Override
	public void powerWithThree() {
		System.out.print("继承的方式实现适配器类：");
		this.powerWithTwo();
	}
}
