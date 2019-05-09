package com.zxt.abstractfactory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		User user = new User();
		
		// 若要改成Oracle数据库，只需要将这句改成OracleFactory即可
		IFactory ifactory = new SQLServerFactory();
		
		IUser iu = ifactory.createUser();
		
		iu.insert(user);
		iu.getUser(1);
	}
}
