package com.zxt.abstractfactory;

public class SQLServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

}
