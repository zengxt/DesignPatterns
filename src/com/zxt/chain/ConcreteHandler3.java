package com.zxt.chain;

/**
 * 
 * @Description: 当请求数在20到30之间则有权处理，否则转到下一位
 *
 * @author： zxt
 *
 * @time: 2019年5月13日 下午9:49:34
 *
 */
public class ConcreteHandler3 extends Handler {

	@Override
	public void HandleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(this.getClass().getName() + " 处理请求 " + request);
			
		} else if (successor != null) {
			// 转移到下一位
			successor.HandleRequest(request);
		}
	}

}
