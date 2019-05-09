package com.zxt.simplefactory;

/**
 * 
 * @Description: 简单工厂模式：通过一个工厂类，根据情况创建不同的对象
 *
 * @author： zxt
 *
 * @time: 2018年7月6日 上午10:50:15
 *
 */
public class OperationFactory {
	
	/**
	 * 
	 * @Description:根据运算符得到具体的运算类
	 * 
	 * @param operationStr
	 * @return
	 */
	public static Operation getOperation(String operationStr) {
		Operation result = null;
		
		switch(operationStr) {
		case "+":
			result = new AddOperation();
			break;
		case "-":
			result = new SubOperation();
			break;
		case "*":
			result = new MulOperation();
			break;
		case "/":
			result = new DivOperation();
			break;
		}
		
		return result;
	}
}
