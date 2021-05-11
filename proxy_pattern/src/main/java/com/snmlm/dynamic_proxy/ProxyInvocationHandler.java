package com.snmlm.dynamic_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InterfaceAddress;
import java.util.Arrays;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//中介生成器
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object obj;
    private ProxyExpand objE;

    public ProxyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    public ProxyInvocationHandler(Object obj,ProxyExpand objE) {
        this.obj = obj;
        this.objE = objE;
    }

    //生成得到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(objE != null){
            objE.before();
        }
        Object result = method.invoke(obj,args);
        if(objE != null){
            objE.after();
        }
        return result;
    }
}
