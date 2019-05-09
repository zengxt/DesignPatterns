package com.zxt.factorymethod;

import com.zxt.simplefactory.AddOperation;

/**
 * 
 * @Description: 加法类工厂
 *
 * @author： zxt
 *
 * @time: 2019年2月21日 下午2:50:43
 *
 */
public class AddFactory implements IFactory {

	@Override
	public AddOperation createOperation() {
		return new AddOperation();
	}

}
