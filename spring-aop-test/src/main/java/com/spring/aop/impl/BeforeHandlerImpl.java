package com.spring.aop.impl;

import java.lang.reflect.Method;

import com.spring.aop.BeforeHandler;
/**
 * BeforeHandler的实现类
 * 
 * @author zwl
 *
 * 2016年9月9日 下午1:53:57
 */
public class BeforeHandlerImpl extends BeforeHandler {

	/**
	 * 方法执行前的业务逻辑
	 */
	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
		// TODO Auto-generated method stub
        System.out.println("方法要执行了，记录日志");
	}

}
