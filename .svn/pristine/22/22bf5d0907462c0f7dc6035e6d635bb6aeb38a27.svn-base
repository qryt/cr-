package com.cr.util;

import java.io.Serializable;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class MethodCacheInterceptor implements InitializingBean,
		MethodInterceptor {
	private static final Log logger = LogFactory.getLog(MethodCacheInterceptor.class); 

	public Cache getCache() {
		return cache;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	private Cache cache; 

	public MethodCacheInterceptor() {
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		 Assert.notNull(cache, "A cache is required. Use setCache(Cache) to provide one.");

	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
	
		String targetName  = invocation.getThis().getClass().getName();
		    String methodName  = invocation.getMethod().getName();
		    Object[] arguments = invocation.getArguments();
		    Object result; 

		    logger.debug("looking for method result in cache");
		    String cacheKey = getCacheKey(targetName, methodName, arguments);
		    Element element = cache.get(cacheKey);
		   
		    if (element == null) {
		      //call target/sub-interceptor
		    	 System.out.println("缓存没有该记录！");
		      logger.debug("calling intercepted method");
		      result = invocation.proceed(); 

		      //cache method result
		      logger.debug("caching result");
		      element = new Element(cacheKey, (Serializable) result);
		      cache.put(element);
		    }
		    else{
		    	 System.out.println("缓存中找到该记录！");
		    }
		    return element.getValue();


	}
	private String getCacheKey(String targetName,
            String methodName,
            Object[] arguments) {
StringBuffer sb = new StringBuffer();
sb.append(targetName)
.append(".").append(methodName);
if ((arguments != null) && (arguments.length != 0)) {
for (int i=0; i<arguments.length; i++) {
sb.append(".")
.append(arguments[i]);
}
} 

return sb.toString();
}


}
