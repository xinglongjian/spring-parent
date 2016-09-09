package com.spring.aopcustom;

import java.lang.reflect.Method;
/**
 * 
 * 
 * @author zwl
 *
 * 2016年9月9日 上午11:40:45
 */
public abstract class BeforeHandler extends AbstractJdkHandler {

	/**
	 * 抽象方法,子类负责实现该方法，用于方法调用前后的处理
	 * @param proxy
	 * @param method
	 * @param args
	 */
	public abstract void handleBefore(Object proxy, Method method, Object[] args);
	
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		handleBefore(proxy, method, args);
		return method.invoke(getTargetObject(), args);
	}

}
