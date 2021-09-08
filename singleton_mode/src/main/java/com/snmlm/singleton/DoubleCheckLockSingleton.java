package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 *
 * 属于懒汉式的并发版
 */
public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton instance = null;
    private DoubleCheckLockSingleton(){}
    public static DoubleCheckLockSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLockSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
