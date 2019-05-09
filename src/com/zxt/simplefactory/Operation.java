package com.zxt.simplefactory;

/**
 * 
 * @Description: 定义一个运算接口，将所有的运算符号都封装成类，并实现本接口
 *
 * @author： zxt
 *
 * @time: 2018年7月6日 上午10:24:13
 *
 */
public interface Operation {

	public double getResult(double firstNum, double secondNum);
}
