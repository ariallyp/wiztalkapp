package com.yuanxin.app.app.service;

import java.io.UnsupportedEncodingException;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.yuanxin.app.app.util.SerializeUtil;

/**
 * 封装redis 缓存服务器服务接口
 * 
 * @author hk
 * 
 *         2012-12-16 上午3:09:18
 */

//@Service(value = "redisService")
public class RedisService implements IRedisService {

	private static String redisCode = "utf-8";

	private RedisService() {

	}
	
	
	private String host;
	
	private String port;
	
	private String keyExpireTime;
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getKeyExpireTime() {
		return keyExpireTime;
	}

	public void setKeyExpireTime(String keyExpireTime) {
		this.keyExpireTime = keyExpireTime;
	}


	@Resource
	private RedisTemplate redisTemplate;

	/**
	 * @param key
	 */
	public long del(final String... keys) {
		return (long) redisTemplate.execute(new RedisCallback() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				long result = 0;
				for (int i = 0; i < keys.length; i++) {
					result = connection.del(keys[i].getBytes());
				}
				return result;
			}
		});
	}

	/**
	 * @param key
	 * @param value
	 * @param liveTime
	 */
	public void set(final byte[] key, final byte[] value, final long liveTime) {
		redisTemplate.execute(new RedisCallback() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.set(key, value);
				if (liveTime > 0) {
					connection.expire(key, liveTime);
				}
				return 1L;
			}
		});
	}

	/**
	 * @param key
	 * @param value
	 * @param liveTime
	 */
	public void set(String key, String value, long liveTime) {
		this.set(key.getBytes(), value.getBytes(), liveTime);
	}

	/**
	 * 设置默认过期的
	 * @param key
	 * @param value
	 */
	public void setDefaultExpire(String key, String value) {
		long expire = System.currentTimeMillis()+Long.parseLong(getKeyExpireTime());
		this.set(key.getBytes(), value.getBytes(),expire );
	}
	
	@Override
	public void setDefaultExpire(byte[] key, byte[] value) {
		// TODO Auto-generated method stub
		long expire = System.currentTimeMillis()+Long.parseLong(getKeyExpireTime());
		this.set(key, value,expire );
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void set(String key, String value) {
		this.set(key, value, 0L);
	}

	/**
	 * @param key
	 * @param value
	 */
	public void set(byte[] key, byte[] value) {
		this.set(key, value, 0L);
	}

	/**
	 * @param key
	 * @return
	 */
	public Object get(final String key) {
		return (Object) redisTemplate.execute(new RedisCallback() {
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				return SerializeUtil.unserialize(connection.get(key.getBytes()));
			}
		});
	}

	/**
	 * @param pattern
	 * @return
	 */
	public Set<?> Setkeys(String pattern) {
		return redisTemplate.keys(pattern);

	}

	/**
	 * @param key
	 * @return
	 */
	public boolean exists(final String key) {
		return (boolean) redisTemplate.execute(new RedisCallback() {
			public Boolean doInRedis(RedisConnection connection)
					throws DataAccessException {
				return connection.exists(key.getBytes());
			}
		});
	}

	/**
	 * @return
	 */
	public String flushDB() {
		return (String) redisTemplate.execute(new RedisCallback() {
			public String doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.flushDb();
				return "ok";
			}
		});
	}

	/**
	 * @return
	 */
	public long dbSize() {
		return (long) redisTemplate.execute(new RedisCallback() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				return connection.dbSize();
			}
		});
	}

	/**
	 * @return
	 */
	public String ping() {
		return (String) redisTemplate.execute(new RedisCallback() {
			public String doInRedis(RedisConnection connection)
					throws DataAccessException {

				return connection.ping();
			}
		});
	}

}