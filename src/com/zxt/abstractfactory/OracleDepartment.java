package com.zxt.abstractfactory;

/**
 * 
 * @Description: Oracle数据库中对Department表的操作
 *
 * @author： zxt
 *
 * @time: 2019年2月24日 下午7:05:07
 *
 */
public class OracleDepartment implements IDepartment {

	@Override
	public void insert(Department user) {
		System.out.println("在  Oracle 中给 Department 表增加一条记录！");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在 Oracle 中根据ID得到  Department 表的一条记录！");
		return null;
	}
}
