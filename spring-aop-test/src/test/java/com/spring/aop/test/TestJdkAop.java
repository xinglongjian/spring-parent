package com.spring.aop.test;

import java.util.ArrayList;
import java.util.List;

import com.spring.aop.AbstractJdkHandler;
import com.spring.aop.AfterHandler;
import com.spring.aop.BeforeHandler;
import com.spring.aop.ProxyFactory;
import com.spring.aop.impl.AfterHandlerImpl;
import com.spring.aop.impl.BeforeHandlerImpl;
import com.spring.beans.Calculator;
import com.spring.beans.CalculatorImpl;

/**
 * 测试aop实现
 * 
 * @author zwl
 *
 * 2016年9月9日 下午2:08:30
 */
public class TestJdkAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator calImpl=new CalculatorImpl();
        
        BeforeHandler before=new BeforeHandlerImpl();
        AfterHandler after=new AfterHandlerImpl();
        
        List<AbstractJdkHandler> handlers=new ArrayList<AbstractJdkHandler>();
        handlers.add(after);
        handlers.add(before);
        
        
        Calculator proxy=(Calculator) ProxyFactory.getProxy(calImpl, handlers);
        
        int result=proxy.calculate(30, 10);
        
        System.out.println("End!result="+result);
	}

}
