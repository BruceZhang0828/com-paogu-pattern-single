package com.zhy.pattern.mapSingle;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private static  Map<String,Object> map = new ConcurrentHashMap<>();

    public static  Object getBeanByName(String beaname){
        if(!map.containsKey(beaname)){
            Object obj = null;
            try {
                obj  = Class.forName(beaname).newInstance();
                map.put(beaname,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return obj;
        }else{
            return map.get(beaname);
        }
    }
}
