package com.zxt.simplefactory;

/**
 * 
 * @Description: 把符号都当做对象处理，实现运算接口
 *
 * @author： zxt
 *
 * @time: 2018年7月6日 上午10:27:50
 *
 */
public class DivOperation implements Operation {

	@Override
	public double getResult(double firstNum, double secondNum) {
		if(secondNum == 0) {
			try {
				throw new Exception("除数不能为0！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return firstNum / secondNum;
	}
}
