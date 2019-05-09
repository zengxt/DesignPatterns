package com.zxt.abstractfactory;

/**
 * 
 * @Description: 对User类操作的接口
 *
 * @author： zxt
 *
 * @time: 2019年2月24日 下午7:00:20
 *
 */
public interface IUser {
	
	void insert(User user);
	
	User getUser(int id);
}
