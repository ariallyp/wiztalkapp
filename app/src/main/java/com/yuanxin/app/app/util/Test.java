package com.yuanxin.app.app.util;

import redis.clients.jedis.Jedis;

public class Test {
	
	public static void main(String[] args) {
		
		Jedis redis= new Jedis( "192.168.1.22", 6379);
		Jedis jedis= new Jedis( "192.168.1.22", 6379);
		/*
		redis.set( "9569badd-ca7c-488a-985e-ffa2f50eb41a", "aaaa");
        System. out.println(redis.get( "key"));
       
        System.out.println(redis.get("9569badd-ca7c-488a-985e-ffa2f50eb41a"));
        String aa = redis.get("9569badd-ca7c-488a-985e-ffa2f50eb41a");*/
       String  pa = MD5Util.getMD5String("123456789");
       System.out.println("25F9E794323B453885F5181F1B624D0B".equals("25F9E794323B453885F5181F1B624D0B"));
       
        System.out.println(pa);
//        redis.set("open_close_skin_key", "close");
        //redis.set("WZTK_LOGIN_TIMES_liyaping", "3");
		//redis.expire("WZTK_LOGIN_TIMES_liyaping",200);
        redis.expire("WZTK_LOGIN_TIMES_liyaping",200);
        redis.expire("WZTK_LOGIN_TIMES_liyaping",200);
		System.err.println(redis.get("WZTK_LOGIN_TIMES_TIMELIMTS_SIZE"));
		   jedis.set("tn", "thisuc"); 
	         
	        System.out.println(jedis.get("tn")); 
	         
	        //在原有值的基础上添加，如若之前没有该key，则导入该key 
	        //之前已经设定了redis对应"myredis",此可执行便会使redis对应"myredisyourredis" 
	        jedis.append("redis","yourredis"); 
	        jedis.append("content", "rabbit"); 
	         
	        System.out.println(jedis.get("redis")); 
	         
	        //mset 是设置多个key value值 参数(key1,value1,key2,value2,key3,value3...) 
	        //mget 是获取多个key所对应的value值 参数（key1,key2,key3,...,keyn）  
	            jedis.mset("name1","thisuc","name2","gaoxc","name3","lemon"); 
	        System.out.println(jedis.mget("name1","name2","name3")); 
		/*redis.set("WZTK_LOGIN_TIMES_TIMELIMTS_SIZE", "50");
		redis.set("WZTK_LOGIN_TIMES_TIMELIMTS", "3");*/
//        System.err.println(redis.get("open_close_skin_key"));
		
		
        
	}
	

}
