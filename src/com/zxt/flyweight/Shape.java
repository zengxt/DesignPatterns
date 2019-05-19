package com.zxt.flyweight;

/**
 * @Description: 抽象形状类，只有一个绘制图型的抽象方法，使用该方法需要传递一个用户对象
 * 
 * @author： zxt
 * 
 * @time: 2018年7月9日 上午9:43:41
 */
public abstract class Shape {
	
	public abstract void draw(User user);
}
