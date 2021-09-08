package com.snmlm.dynamicproxy;

import com.snmlm.dynamicproxy.*;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//客户
public class DynamicProxyTest {
    public static void main(String[] args) {
        ((AbstractHouseOwner)new ProxyInvocationHandler(new HouseOwner(),new ProxyExpandImpl()).getProxy()).rent();
        ((HouseOwner)new ProxyMethodInterceptor(new HouseOwner(),new ProxyExpandImpl()).getProxy()).rent();
    }
}
