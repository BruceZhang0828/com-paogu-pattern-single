package com.zhy.pattern.seriable;

import java.io.Serializable;

public class Seriable implements Serializable {
    public final static Seriable INSTANCE = new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
