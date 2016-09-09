package com.spring.aopspring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
/**
 * 基于spring2.x之前提供的方法前置通知 建议（Advice）
 * 
 * @author zwl
 *
 * 2016年9月9日 下午3:06:06
 */
public class BeforeHandlerModule implements MethodBeforeAdvice {

	/**
	 * 方法执行前具体的执行代码
	 */
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
        System.out.println("方法要执行了，名称为:"+method.getName());
	}

}
