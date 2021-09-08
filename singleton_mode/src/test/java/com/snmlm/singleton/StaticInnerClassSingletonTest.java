package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class StaticInnerClassSingletonTest {
    public static void main(String[] args) {
        StaticInnerClassSingleton instance1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
