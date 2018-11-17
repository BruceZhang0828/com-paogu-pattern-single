package com.zhy.pattern.lazySingle;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LazyOneTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int count = 200;
        CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread(()->{
                try {
                    //线程阻塞 有一个共享锁 当count = 0的时候释放共享锁 所有的线程一起运行之后的代码（万箭齐发的感觉）
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //在一瞬间有很多线程去调用getInstance的方法。
                LazyOne instance = LazyOne.getInstance();
                System.out.println(instance);
            }).start();
            //每次线程启动 count--；
            latch.countDown();
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
