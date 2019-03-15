package com.cr.util;

import java.lang.reflect.Method;
import java.util.List;

import net.sf.ehcache.Cache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class MethodCacheAfterAdvice implements AfterReturningAdvice,
		InitializingBean {
	public Cache getCache() {
		return cache;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	private static final Log logger = LogFactory
	   .getLog(MethodCacheAfterAdvice.class);
	 private Cache cache;

	public MethodCacheAfterAdvice() {
		// TODO Auto-generated constructor stub
	}

	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		
		String className = arg3.getClass().getName();
		//System.out.println(className);
		  List list = cache.getKeys();
		 // System.out.println("缓存清空！"+list.size());
		  for (int i = 0; i < list.size(); i++) {
		   String cacheKey = String.valueOf(list.get(i));
		   if (cacheKey.startsWith(className)) {
		    cache.remove(cacheKey);
		   // System.out.println("remove cache " + cacheKey);
		    logger.debug("remove cache " + cacheKey);
		   }
		  }


	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		 Assert.notNull(cache,
		    "Need a cache. Please use setCache(Cache) create it.");

	}

}
