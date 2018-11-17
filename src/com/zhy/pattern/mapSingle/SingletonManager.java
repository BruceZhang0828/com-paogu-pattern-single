package com.zhy.pattern.mapSingle;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 注册式的 单例模式
 */
public class SingletonManager {
    private static Map<String,SingletonManager> singletonMap = new HashMap<>();
    private SingletonManager(){}

    public static void registerService(String key,SingletonManager singletonManager){
        if(!singletonMap.containsKey(key)){
            singletonMap.put(key,singletonManager);
        }
    }

    public static SingletonManager getInstance(String key){
        return singletonMap.get(key);
    }



}
