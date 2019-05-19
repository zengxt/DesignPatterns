package com.zxt.flyweight;

import java.util.HashMap;

public class CircleFactory {
	// 享元对象池
	private static HashMap<String, Shape> shapes = new HashMap<String, Shape>();

	public static Shape getShape(String key) {
		// 享元池中存在享元对象，则直接返回
		if (shapes.containsKey(key)) {
			return (Shape) shapes.get(key);

		} else {
			// 享元池中不存在享元对象，并将它放到享元池中
			Shape shape = new Circle(key);
			shapes.put(key, shape);
			
			return shape;
		}
	}

	public static int getShapesNum() {
		return shapes.size();
	}
}