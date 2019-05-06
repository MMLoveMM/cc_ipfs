package cn.net.sinodata.service;

import java.util.Collection;

/**
 * 缓存监听服务
 * 
 * @author Pangpj
 *
 */
public interface CacheListener {
	
	/**
	 * 添加缓存回调
	 * @param cacheName
	 * @param key
	 * @param value
	 */
	void addCallback(String cacheName, Object key, Object value);
	
	/**
	 * 清除所有缓存回调
	 * @param cacheNames
	 */
	void clearCallback(Collection<String> cacheNames);
	
	/**
	 * 清除指定缓存回调
	 * @param cacheName
	 * @param key
	 */
	void clearCallback(String cacheName, Object key);
	
}
