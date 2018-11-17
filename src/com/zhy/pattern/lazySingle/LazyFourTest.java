package com.zhy.pattern.lazySingle;

public class LazyFourTest {

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            LazyFour instance = LazyFour.getInstance();
            System.out.println(instance);
        }
    }
}
