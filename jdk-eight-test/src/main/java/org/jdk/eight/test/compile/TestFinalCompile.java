package org.jdk.eight.test.compile;
/**
 * 测试编译时、运行时
 * @author zwl
 *
 * 2016年9月23日 上午11:34:50
 */
public class TestFinalCompile {

	public static final int num1=10;
	public static final int num2=3;
	public static int num3=20;
	public static int num4=4;
	
	public static void main(String[] args) {
	    /**
	     * a的值实在编译期计算的
	     */
		int a=num1*num2;
		int b=num3*num4;
	}
	
}
