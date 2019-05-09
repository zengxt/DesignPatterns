package com.zxt.abstractfactory;

/**
 * 
 * @Description:  SQL Server数据库中对Department表的操作
 *
 * @author： zxt
 *
 * @time: 2019年2月24日 下午7:04:39
 *
 */
public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department user) {
		System.out.println("在  SQL Server 中给 Department 表增加一条记录！");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在  SQL Server 中根据ID得到  Department 表的一条记录！");
		return null;
	}
}
