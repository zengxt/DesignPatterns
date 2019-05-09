package com.zxt.factorymethod;

import com.zxt.simplefactory.SubOperation;

/**
 * 
 * @Description: 减法类工厂
 *
 * @author： zxt
 *
 * @time: 2019年2月21日 下午2:52:36
 *
 */
public class SubFactory implements IFactory {

	@Override
	public SubOperation createOperation() {
		return new SubOperation();
	}

}
