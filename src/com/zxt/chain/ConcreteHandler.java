package com.zxt.chain;

/**
 * 
 * @Description: 末端处理器
 *
 * @author： zxt
 *
 * @time: 2019年5月13日 下午9:49:34
 *
 */
public class ConcreteHandler extends Handler {

	@Override
	public void HandleRequest(int request) {
		System.out.println(this.getClass().getName() + " 处理请求 " + request);
	}

}
