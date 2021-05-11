package com.snmlm.dynamic_proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: snmlm
 * @create: 2021-05-08
 */
//
public class ProxyMethodInterceptor implements MethodInterceptor {
    //被代理的接口
    private Object obj;
    private ProxyExpand objE;

    public ProxyMethodInterceptor(Object obj) {
        this.obj = obj;
    }

    public ProxyMethodInterceptor(Object obj,ProxyExpand objE) {
        this.obj = obj;
        this.objE = objE;
    }

    public Object getProxy(){
        //1.代理对象生成器(工厂思想)
        Enhancer enhancer = new Enhancer();
        //2.在增强器上设置两个属性
        //设置要生成代理对象的目标对象：生成的目标对象类型的子类型
        enhancer.setSuperclass(obj.getClass());
        //设置回调方法
        enhancer.setCallback(this);
        //3.创建获取对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
