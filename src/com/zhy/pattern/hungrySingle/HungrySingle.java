package com.zhy.pattern.hungrySingle;

public class HungrySingle {
    /**
     * 防止new一个新的
     */
    private HungrySingle(){}

    private static final HungrySingle INSTANCE = new HungrySingle();

    public static HungrySingle getInstance(){
        return  INSTANCE;
    }
}
