package com.zxt.chain;

public class Test {

	public static void main(String[] args) {
		// 设置职责链的上下家
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		Handler h = new ConcreteHandler();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		h3.setSuccessor(h);
		
		int[] requests = {2, 5, 14, 22, 18, 3, 27, 20, 40};
		
		// 循环给最小处理者提交请求，不同的数额，由不同权限处理者处理
		for(int i = 0; i < requests.length; i++) {
			h1.HandleRequest(requests[i]);
		}
	}
}
