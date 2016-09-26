package com.spring.data.test.redis;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.data.redis.LocalRedisConfig;

@ContextConfiguration(classes=LocalRedisConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class LocalRedisConfigTest {

	   @Autowired
	   private JedisConnectionFactory jedisConnectionFactory;
	   
	   @Autowired
	   private StringRedisTemplate redisTemplate;
	   
	   @Test
	   public void testJedisConnectionFactory() {
	      assertNotNull(jedisConnectionFactory);
	   }

	   @Test
	   public void testRedisTemplate() {
	      assertNotNull(redisTemplate);
	   }
	   
	  
}
