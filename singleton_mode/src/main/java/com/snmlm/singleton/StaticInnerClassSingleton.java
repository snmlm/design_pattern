package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class StaticInnerClassSingleton {
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
    private StaticInnerClassSingleton(){}
    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
