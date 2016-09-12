package org.spring.bean.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 业务逻辑实现类
 * @author zwl
 *
 * 2016年9月12日 下午4:14:15
 */
public class HellowordServiceImpl implements HellowordService,BeanNameAware,
     BeanFactoryAware,InitializingBean,DisposableBean {

	private String context;
	
	public void setContext(String context) {
		this.context = context;
	}

	public void close(){
	    System.out.println("关闭操作");
	  }
	  
	public void init(){
	    System.out.println("初始化操作");
	  }
	
	/**
	 * 业务方法
	 */
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("sayHello方法调用...");
	}

	/**
	 * BeanNameAware接口的方法
	 * @param name
	 */
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName方法调用...,name="+name);
	}

	/**
	 * BeanFactoryAware接口方法
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory方法调用...");
	}

	/**
	 * InitializingBean接口方法
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet方法调用...");
	}

	/**
	 * DisposableBean接口方法
	 */
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy方法调用...");
	}

}
