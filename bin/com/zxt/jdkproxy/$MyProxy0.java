package com.zxt.jdkproxy;

import java.lang.reflect.Method;
import com.zxt.staticproxy.Moveable;

public class $MyProxy0 implements Moveable {

	private MyInvocationHandler h;

	public $MyProxy0( MyInvocationHandler h ) {
		this.h = h;
	}

	@Override
	public void move() {
 		try { 
 			Method md = Moveable.class.getMethod("move");
			h.invoke(this, md);
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

}