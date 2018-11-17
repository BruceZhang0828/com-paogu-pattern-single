package com.zhy.pattern.lazySingle;

/**
 * 使用内部类完成一个单列模式
 */
public class LazyFour {

    private LazyFour(){}

    private static class Inner{
        private static final LazyFour lazyFour = new LazyFour();
    }

    public static LazyFour getInstance(){
        return Inner.lazyFour;
    }
}
