package com.zxt.adapter;

/**
 * 
 * @Description: 客户端的需求
 *
 * @author： zxt
 *
 * @time: 2019年5月8日 下午9:08:17
 *
 */
public class Computer {
	
	// 笔记本电脑需要一个三相的插座供电
	private ThreePlugInterface plug;
	
	public Computer(ThreePlugInterface plug) {
		this.plug = plug;
	}
	
	// 使用插座充电
	public void charge() {
		plug.powerWithThree();
	}
	
	public static void main(String[] args) {
		GBTwoPlug two = new GBTwoPlug();
		ThreePlugInterface three = new TwoPlugAdapter(two);
		Computer cp = new Computer(three);
		cp.charge();
		
		three = new TwoPlugAdapterExtends();
		cp = new Computer(three);
		cp.charge();
	}
}
