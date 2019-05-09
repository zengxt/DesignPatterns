package com.zxt.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		
		// 若要改成Oracle数据库，只需要将这句改成SQLServerFactory即可
		IFactory ifactory = new OracleFactory();
		
		IUser iu = ifactory.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = ifactory.createDepartment();
		id.insert(department);
		id.getDepartment(1);
	}
}
