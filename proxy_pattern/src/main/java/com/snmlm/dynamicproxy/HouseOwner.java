package com.snmlm.dynamicproxy;


/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//实际房东
public class HouseOwner implements AbstractHouseOwner {
    @Override
    public void rent() {
        System.out.println("房东要出租房屋！");
    }

    @Override
    public void collectMoney() {
        System.out.println("房东要收房租");
    }
}
