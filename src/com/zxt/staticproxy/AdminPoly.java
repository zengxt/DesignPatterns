package com.zxt.staticproxy;

/**
 * 
 * @Description: 以聚合的方式实现代理主题
 *
 * @author： zxt
 *
 * @time: 2018年7月7日 下午2:37:08
 *
 */
public class AdminPoly implements Manager {
	// 真实主题类的引用
	private Admin admin;
	
	public AdminPoly(Admin admin) {
		this.admin = admin;
	}
	
	@Override
	public void doSomething() {
		System.out.println("聚合方式实现代理：Admin操作开始！！");
		admin.doSomething();
		System.out.println("聚合方式实现代理：Admin操作结束！！");
	}
}
