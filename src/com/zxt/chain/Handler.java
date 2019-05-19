package com.zxt.chain;

/**
 * 
 * @Description: 定义一个处理请求的接口
 *
 * @author： zxt
 *
 * @time: 2019年5月13日 下午9:31:56
 *
 */
public abstract class Handler {
	
	// 设置继任者
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	// 处理请求的抽象方法
	public abstract void HandleRequest(int request);
}
