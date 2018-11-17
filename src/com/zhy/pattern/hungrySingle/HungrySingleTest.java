package com.zhy.pattern.hungrySingle;

public class HungrySingleTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(HungrySingle.getInstance());
        }
    }
}
