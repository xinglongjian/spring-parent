package com.spring.aopspring;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
/**
 * 基于spring2.x之前的方法事后通知
 * 
 * @author zwl
 *
 * 2016年9月9日 下午3:14:09
 */
public class AfterHandlerModule implements AfterReturningAdvice {

	/**
	 * 方法调用完成后具体实现代码
	 */
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub

		System.out.println("方法调用完成");
	}

}
