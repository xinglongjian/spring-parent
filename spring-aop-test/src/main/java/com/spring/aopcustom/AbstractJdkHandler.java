package com.spring.aopcustom;

import java.lang.reflect.InvocationHandler;
/**
 * 基于JDK实现动态代理方式
 * 
 * @author zwl
 *
 * 2016年9月9日 上午11:23:23
 */
public abstract class AbstractJdkHandler implements InvocationHandler {

	/**
	 * 目标对象
	 */
	private Object targetObject;

	/**
	 * 
	 * @return 
	 */
	public Object getTargetObject() {
		return targetObject;
	}

	/**
	 * 设置新的目标对象
	 * 
	 * @param targetObject 新的目标对象
	 */
	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}

	
	
}
