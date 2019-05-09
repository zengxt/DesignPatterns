package com.zxt.abstractfactory;

public class EasyFactoryReflect {

	private static String packName = "com.zxt.abstractfactory";
	private static String sqlName = "Oracle";

	public static IUser createUser() throws Exception {
		String className = packName + "." + sqlName + "User";
		return (IUser) Class.forName(className).newInstance();
	}

	public static IDepartment createLogin() throws Exception {
		String className = packName + "." + sqlName + "Department";
		return (IDepartment) Class.forName(className).newInstance();
	}
}
