package com.zxt.flyweight;

public class Client {

	public static void main(String[] args) {
		Shape shape1 = CircleFactory.getShape("红色");
		shape1.draw(new User("张三"));

		Shape shape2 = CircleFactory.getShape("灰色");
		shape2.draw(new User("李四"));

		Shape shape3 = CircleFactory.getShape("绿色");
		shape3.draw(new User("王五"));

		Shape shape4 = CircleFactory.getShape("红色");
		shape4.draw(new User("赵四"));

		Shape shape5 = CircleFactory.getShape("灰色");
		shape5.draw(new User("前乾"));

		Shape shape6 = CircleFactory.getShape("灰色");
		shape6.draw(new User("孙李"));

		System.out.println("一共创建了：" + CircleFactory.getShapesNum() + " 个图形对象！");
	}
}