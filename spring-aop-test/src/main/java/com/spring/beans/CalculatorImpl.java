package com.spring.beans;
/**
 * 具体业务逻辑实现类
 * 
 * @author zwl
 *
 * 2016年9月9日 下午2:06:03
 */
public class CalculatorImpl implements Calculator {

	/**
	 * 具体业务方法
	 */
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("***具体业务方法执行***");
		return a/b;
	}

}
