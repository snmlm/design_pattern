package com.snmlm.staticproxy;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//实际房东
public class HouseOwner implements AbstractHouseOwner {
    @Override
    public void rent() {
        System.out.println("房东出租房屋！");
    }
}
