package org.spring.bean.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 * bean工厂钩子
 * @author zwl
 *
 * 2016年9月12日 下午4:27:06
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		 System.out.println("初始化之前" + beanName); 
	     return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("初始化之后" + beanName); 
	    return bean;
	}

}
