package com.zhy.pattern.lazySingle;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class LazyOneTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[200];
        for (int i = 0; i < 200; i++) {
           threads[i] =  new Thread(()->{
               System.out.println(LazyOne.getInstance());
            });
        }

        Arrays.stream(threads).forEach(Thread::start);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
