package com.snmlm.dynamic_proxy;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//拓展能力实现
public class ProxyExpandImpl implements ProxyExpand{
    @Override
    public void before() {
        System.out.println("我是中介");
    }

    @Override
    public void after() {
        System.out.println("想租吗？走带你看房签合同！");
    }
}
