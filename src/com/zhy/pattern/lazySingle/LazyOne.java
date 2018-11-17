package com.zhy.pattern.lazySingle;

/**
 * 懒汉式 ---线程不安全
 */
public class LazyOne {

    private LazyOne(){}

    private static LazyOne lazyOne = null;

    public static LazyOne getInstance(){
        if (lazyOne==null){
            lazyOne = new LazyOne();
        }

        return lazyOne;
    }
}
