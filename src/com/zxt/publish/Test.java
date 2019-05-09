package com.zxt.publish;

public class Test {
	
	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		
		cs.attach(new ConcreteObserver(cs, "X"));
		cs.attach(new ConcreteObserver(cs, "Y"));
		cs.attach(new ConcreteObserver(cs, "Z"));
		
		cs.setSubjectState("123");
		cs.notifyUpdate();
		
		cs.setSubjectState("ABC");
		cs.notifyUpdate();
	}
}
