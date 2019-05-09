package com.zxt.factorymethod;

import com.zxt.simplefactory.DivOperation;

/**
 * 
 * @Description: 除法类工厂
 *
 * @author： zxt
 *
 * @time: 2019年2月21日 下午2:54:13
 *
 */
public class DivFactory implements IFactory {

	@Override
	public DivOperation createOperation() {
		return new DivOperation();
	}

}
