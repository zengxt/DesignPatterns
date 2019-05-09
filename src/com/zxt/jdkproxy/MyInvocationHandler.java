package com.zxt.jdkproxy;

import java.lang.reflect.Method;

public interface MyInvocationHandler {

	public void invoke(Object o, Method m);
}
