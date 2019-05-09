package com.zxt.factorymethod;

import com.zxt.simplefactory.Operation;

/**
 * 
 * @Description: 工厂的接口
 *
 * @author： zxt
 *
 * @time: 2019年2月21日 下午2:49:43
 *
 */
public interface IFactory {
	
	public Operation createOperation();
}
