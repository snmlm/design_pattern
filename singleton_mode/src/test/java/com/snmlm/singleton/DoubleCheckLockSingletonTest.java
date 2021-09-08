package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class DoubleCheckLockSingletonTest {
    public static void main(String[] args) {
        DoubleCheckLockSingleton instance1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton instance2 = DoubleCheckLockSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
