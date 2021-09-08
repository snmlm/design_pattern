package com.snmlm.singleton;

/**
 * @author: snmlm
 * @create: 2021-09-08
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
