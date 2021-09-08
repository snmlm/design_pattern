package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
