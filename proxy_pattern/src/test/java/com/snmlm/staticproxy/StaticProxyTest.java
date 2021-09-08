package com.snmlm.staticproxy;

import com.snmlm.staticproxy.HouseOwner;
import com.snmlm.staticproxy.Proxy;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//客户
public class StaticProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new HouseOwner());
        proxy.rent();
    }
}
