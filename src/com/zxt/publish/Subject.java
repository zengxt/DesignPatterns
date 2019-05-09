package com.zxt.publish;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description: Subject类，可翻译为主题或者抽象通知者，一般用一个抽象类或者一个接口实现。它把所有对观察者对象的引用保存在一个集合里，
 * 每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象。
 *
 * @author： zxt
 *
 * @time: 2019年4月25日 上午10:54:34
 *
 */
public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	// 增加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	// 移除观察者
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	// 通知
	public void notifyUpdate() {
		for(Observer o : observers) {
			o.update();
		}
	}
}
