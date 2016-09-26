package com.spring.data.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class TestRedis {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:redis/applicationContext-redis.xml");
		@SuppressWarnings("unchecked")
		RedisTemplate<String,Person> template=(RedisTemplate<String, Person>) context.getBean("redisTemplate");
		String random = template.randomKey();
//		template.set(random, new Person("John", "Smith"));
	}

}
