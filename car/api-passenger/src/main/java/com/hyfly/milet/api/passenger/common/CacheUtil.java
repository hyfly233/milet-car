package com.hyfly.milet.api.passenger.common;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

/**
 * Cache
 *
 * @author hyfly
 */
public class CacheUtil {

    private CacheUtil() {
    }

    private static CacheManager CACHE_MANAGER = SpringContextHolder.getBean(CacheManager.class);

    private static Cache passengerCache;

    public static Cache passengerCache() {
        if (passengerCache == null) {
            passengerCache = initCache(Constant.CACHE_KEY_PASSENGER);
        }
        return passengerCache;
    }

    private static Cache initCache(String key) {
        return CACHE_MANAGER.getCache(key);
    }

}