package com.zxt.abstractfactory;

/**
 * 
 * @Description:  SQL Server数据库中对User表的操作
 *
 * @author： zxt
 *
 * @time: 2019年2月24日 下午7:04:39
 *
 */
public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在  SQL Server 中给 User 表增加一条记录！");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在  SQL Server 中根据ID得到  User 表的一条记录！");
		return null;
	}
}
