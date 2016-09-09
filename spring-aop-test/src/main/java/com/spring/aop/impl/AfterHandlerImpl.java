package com.spring.aop.impl;

import java.lang.reflect.Method;

import com.spring.aop.AfterHandler;
/**
 * AfterHandler的实现类
 * 
 * @author zwl
 *
 * 2016年9月9日 下午1:51:20
 */
public class AfterHandlerImpl extends AfterHandler {

	/**
	 * 实际的业务逻辑编写
	 */
	@Override
	public void handleAfter(Object proxy, Method method, Object[] args) {
		// TODO Auto-generated method stub
         System.out.println("方法执行完成，正在记录日志");
	}

}
