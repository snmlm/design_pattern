package com.snmlm.staticproxy;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//中介
public class Proxy implements AbstractHouseOwner {
    private HouseOwner houseOwner;

    public Proxy() {
    }

    public Proxy(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    //帮房东出租房屋
    public void rent() {
        System.out.println("我是中介！");
        houseOwner.rent();
        System.out.println("想租吗？走带你看房签合同！");
    }
}
