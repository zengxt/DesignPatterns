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
public class Computer {

	private static Scanner scanner;
	
	/**
	 * 
	 * @Description:这里使用的是最基本的实现，并没有体现出面向对象的编程思想，代码的扩展性差，甚至连除数可能为0的情况也没有考虑
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
		
		if(operation.equals("+")) {
			System.out.println("result：" + (firstNum + secondNum));
		} else if(operation.equals("-")) {
			System.out.println("result：" + (firstNum - secondNum));
		} else if(operation.equals("*")) {
			System.out.println("result：" + (firstNum * secondNum));
		} else if(operation.equals("/")){
			System.out.println("result：" + (firstNum / secondNum));
		}
	}
}
