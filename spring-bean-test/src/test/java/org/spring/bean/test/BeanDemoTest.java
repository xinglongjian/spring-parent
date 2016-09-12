package org.spring.bean.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *  //ApplicationContext中bean的生命周期 
 * @author zwl
 *
 * 2016年9月12日 下午4:37:08
 */
public class BeanDemoTest {
//	@Test 
//    public void test() throws Exception{ 
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
//        ConfigurableApplicationContext cont = (ConfigurableApplicationContext) context;   
//        cont.close(); 
//         
//    } 
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
        ConfigurableApplicationContext cont = (ConfigurableApplicationContext) context;   
        cont.close(); 
	}
}
