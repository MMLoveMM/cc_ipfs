package cn.net.sinodata.service.Impl;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import cn.net.sinodata.service.CacheListener;
import cn.net.sinodata.service.CacheService;


@Service
public class CacheServiceImpl implements CacheService{
	
	private final static Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);

	@Autowired
	CacheManager cacheManager;
	
	@Autowired(required = false)
	CacheListener cacheListener;
	
	@Override
	public void clearCache(String cacheName, Object key) {
		Cache cache = cacheManager.getCache(cacheName);
		if (cache != null) {
			if (key == null) {
				cache.clear();
			} else {
				cache.evict(key);
			}
		} else {
			logger.error("cache:{} is not exist , clear failed", cacheName);
		}
		if (cacheListener != null) {
			cacheListener.clearCallback(cacheName, key);
		}
	}

	@Override
	public void addCache(String cacheName, Object key, Object value) {
		Cache cache = cacheManager.getCache(cacheName);
		if (cache != null) {
			cache.put(key, value);
		} else {
			logger.error("cache:{} is not exist , clear failed", cacheName);
		}
		if (cacheListener != null) {
			cacheListener.addCallback(cacheName, key, value);
		}
	}

	@Override
	public Object getCache(String cacheName, Object key) {
		Cache cache = cacheManager.getCache(cacheName);
		ValueWrapper value = null;
		if (cache != null) {
			value = cache.get(key);
		} else {
			logger.error("cache:{} is not exist , add failed", cacheName);
		}
		return value == null ? null : value.get();
	}

	@Override
	public void clearCache() {
		Collection<String> cacheNames = cacheManager.getCacheNames();
		for (String cacheName : cacheNames) {
			cacheManager.getCache(cacheName).clear();
		}
		if (cacheListener != null) {
			cacheListener.clearCallback(cacheNames);
		}
	}

	@Override
	public void syncClearCache() {
		Collection<String> cacheNames = cacheManager.getCacheNames();
		for (String cacheName : cacheNames) {
			cacheManager.getCache(cacheName).clear();
		}
	}

	@Override
	public void syncClearCache(String cacheName, Object key) {
		Cache cache = cacheManager.getCache(cacheName);
		if (cache != null) {
			if (key == null) {
				cache.clear();
			} else {
				cache.evict(key);
			}
		} else {
			logger.error("cache:{} is not exist , clear failed", cacheName);
		}
	}
	
}
