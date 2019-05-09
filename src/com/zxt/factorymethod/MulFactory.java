package com.zxt.factorymethod;

import com.zxt.simplefactory.MulOperation;

/**
 * 
 * @Description: 乘法类工厂
 *
 * @author： zxt
 *
 * @time: 2019年2月21日 下午2:53:19
 *
 */
public class MulFactory implements IFactory {

	@Override
	public MulOperation createOperation() {
		return new MulOperation();
	}

}
