package com.spring.aopcustom;

import java.lang.reflect.Method;
/**
 * 该类提供了方法调用后的处理模板
 * 
 * @author zwl
 *
 * 2016年9月9日 上午11:35:07
 */
public abstract class AfterHandler extends AbstractJdkHandler {

	/**
	 * 抽象方法,子类负责实现该方法，用于方法调用完后的处理
	 * @param proxy
	 * @param method
	 * @param args
	 */
	public abstract void handleAfter(Object proxy,Method method,Object[] args);
	
	/**
	 * 在代理实例上处理方法调用并返回结果
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result=method.invoke(getTargetObject(), args);
		handleAfter(proxy, method, args);
		return result;
	}

}
