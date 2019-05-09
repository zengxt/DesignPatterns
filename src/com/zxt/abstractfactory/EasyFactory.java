package com.zxt.abstractfactory;

public class EasyFactory {

	private static String db = "SqlServer";
	// private static String db = "Oracle";

	public static IUser createUser() {
		IUser result = null;
		switch (db) {
		case "SqlServer":
			result = new SqlServerUser();
			break;
		case "Oracle":
			result = new OracleUser();
			break;
		}

		return result;
	}

	public static IDepartment createDepartment() {
		IDepartment result = null;
		switch (db) {
		case "SqlServer":
			result = new SqlServerDepartment();
			break;
		case "Oracle":
			result = new OracleDepartment();
			break;
		}

		return result;
	}
}
