package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
