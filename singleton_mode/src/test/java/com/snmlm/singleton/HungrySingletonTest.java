package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
