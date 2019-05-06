package cn.net.sinodata.service;

/**
 * 缓存服务
 * 
 * @author Pangpj
 *
 */
public interface CacheService {

	/**
	 * 清除缓存
	 * 
	 * @param key
	 *            为null时清除所有
	 */
	void clearCache(String cacheName, Object key);

	/**
	 * 
	 * @param cacheName
	 *            缓存名称
	 * @param key
	 *            缓存key
	 * @param value
	 *            缓存对象
	 */
	void addCache(String cacheName, Object key, Object value);

	/**
	 * 
	 * @param cacheName
	 *            缓存名
	 * @param key
	 *            缓存key
	 * @return
	 */
	Object getCache(String cacheName, Object key);

	/**
	 * 清除所有缓存
	 */
	void clearCache();
	
	/**
	 * 用于系统之间缓存同步
	 * 只能用于通过其他系统发起的缓存同步使用
	 * 清除所有缓存
	 */
	void syncClearCache();
	
	/**
	 * 用于系统之间缓存同步
	 * 只能用于通过其他系统发起的缓存同步使用
	 * @param cacheName
	 * @param key
	 */
	void syncClearCache(String cacheName, Object key);
}
