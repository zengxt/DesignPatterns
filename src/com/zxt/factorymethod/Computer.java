package com.zxt.factorymethod;

import java.util.Scanner;

import com.zxt.simplefactory.Operation;

/**
 * 
 * @Description: 实现一个简单的计算器功能，使用工厂方法模式
 *
 * @author： zxt
 *
 * @time: 2018年7月6日 上午10:11:50
 *
 */
public class Computer {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("请输入第一个数字：");
		int firstNum = scanner.nextInt();
		
		System.out.print("请输入第二个数字：");
		int secondNum = scanner.nextInt();
		
		System.out.print("请输入运算符：");
		String operation = scanner.next();
		
		IFactory operFactory = null;
		if(operation.equals("+")) {
			operFactory = new AddFactory();
		} else if(operation.equals("-")) {
			operFactory = new SubFactory();
		} else if(operation.equals("*")) {
			operFactory = new MulFactory();
		} else if(operation.equals("/")){
			operFactory = new DivFactory();
		}
		Operation oper = operFactory.createOperation();
		double result = oper.getResult(firstNum, secondNum);
		System.out.println("result = " + result);
	}
}
