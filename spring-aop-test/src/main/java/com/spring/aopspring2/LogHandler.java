package com.spring.aopspring2;
/**
 * 日志记录模块
 * 
 * @author zwl
 *
 * 2016年9月9日 下午3:29:16
 */
public class LogHandler {

	 public void beforeLog(){  
	     System.out.println("开始执行");  
	 }  
	 
	 public void afterLog(){  
	     System.out.println("执行完毕");  
	 }  
}
