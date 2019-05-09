package com.zxt.abstractfactory;

/**
 * 
 * @Description: 得到对User表操作的IUser对象的抽象工厂接口
 *
 * @author： zxt
 *
 * @time: 2019年2月24日 下午7:06:37
 *
 */
public interface IFactory {
	
	public IUser createUser();
	
	public IDepartment createDepartment();
}
