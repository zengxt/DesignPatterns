package com.zxt.abstractfactory;

public class EasyClient {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();

		// 直接得到实际的数据库访问实例，而不存在任何依赖
		IUser userOperation = EasyFactory.createUser();

		userOperation.getUser(1);
		userOperation.insert(user);

		// 直接得到实际的数据库访问实例，而不存在任何依赖
		IDepartment departmentOperation = EasyFactory.createDepartment();

		departmentOperation.insert(department);
		departmentOperation.getDepartment(1);
	}
}
