package com.spring.aop;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * 代理创建工厂类
 * 
 * @author zwl
 *
 * 2016年9月9日 上午11:20:52
 */
public class ProxyFactory {

	/**
	 * 获取proxy代理对象
	 * 
	 * @param targetObject
	 * @param handlers
	 * @return
	 */
	public static Object getProxy(Object targetObject,List<AbstractJdkHandler> handlers){
		Object proxyObject=null;
		if(handlers.size()>0){
			proxyObject=targetObject;
			for(int i=0;i<handlers.size();i++){
				handlers.get(i).setTargetObject(proxyObject);
				proxyObject=Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), 
						targetObject.getClass().getInterfaces(), handlers.get(i));
			}
			return proxyObject;
		}else{
			return targetObject;
		}
	}
	
}
