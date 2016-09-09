package com.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Calculator;

/**
 * 
 * @author zwl
 *
 * 2016年9月9日 下午3:22:50
 */
public class TestSpringAop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");  
        Calculator calProxy = (Calculator)ac.getBean("calculatorTarget");  
        int result=calProxy.calculate(30, 10);
        System.out.println("End,result="+result);
	}

}
