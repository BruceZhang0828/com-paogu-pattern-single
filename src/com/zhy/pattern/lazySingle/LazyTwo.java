package com.zhy.pattern.lazySingle;

public class LazyTwo {
    private LazyTwo(){}

    private static LazyTwo lazyTwo = null;

    /**
     * 使用synchronized 保证线程安全  但是数量达到一个级别的时候严重影响效率
     * @return
     */
    public synchronized static LazyTwo getInstance(){
        if (lazyTwo==null){
            lazyTwo = new LazyTwo();
        }

        return lazyTwo;
    }

}
