package com.spring.data.plugin;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 拦截器demo1
 * @author zwl
 *
 * 2016年9月23日 下午6:05:58
 */
@Intercepts(value={@Signature(args={MappedStatement.class,Object.class},method="update",type=Executor.class)})
public class InterceptorDemo2 implements Interceptor {

	private Logger logger=LoggerFactory.getLogger(InterceptorDemo2.class);
	
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		logger.debug(InterceptorDemo2.class.getName());
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		// TODO Auto-generated method stub
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub

	}

}
