package com.zxt.simplefactory;

import java.util.Scanner;

/**
 * 
 * @Description: 实现一个简单的计算器功能
 *
 * @author： zxt
 *
 * @time: 2018年7月6日 上午10:11:50
 *
 */
public class Computer2 {

	private static Scanner scanner;
	
	/**
	 * 
	 * @Description：这里使用的简单工厂模式实现
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("请输入第一个数字：");
		int firstNum = scanner.nextInt();
		
		System.out.print("请输入第二个数字：");
		int secondNum = scanner.nextInt();
		
		System.out.print("请输入运算符：");
		String operation = scanner.next();
		
		// 客户端调用
		Operation oper = OperationFactory.getOperation(operation);
		double result = oper.getResult(firstNum, secondNum);
		System.out.println(result);
	}
}
