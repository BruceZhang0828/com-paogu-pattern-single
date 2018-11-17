package com.zhy.pattern.lazySingle;

/**
 * 单例模式 双重锁
 * volatile保证变量的可见性
 * synchronized 保证可见性和原子性
 */
public class LazyThree {
    private volatile static LazyThree lazyThree = null;

    private LazyThree(){}

    public static LazyThree getInstance(){
        if (lazyThree==null){
            synchronized (LazyThree.class){
                if (lazyThree==null){
                    lazyThree = new LazyThree();
                }
            }
        }


        return lazyThree;
    }

}
