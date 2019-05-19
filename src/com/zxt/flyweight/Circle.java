package com.zxt.flyweight;

/**
 * @Description: 绘制图形的具体类 
 * 
 * @author： zxt
 * 
 * @time: 2018年7月9日 上午9:46:16
 */
public class Circle extends Shape {
	// 享元类的内部状态
	private String color;

	public Circle(String color) {
		this.color = color;
	}

	@Override
	public void draw(User user) {
		System.out.println("用户：" + user.getName() + "，画了一个  '" + color + "' 的圆形！");
	}
}