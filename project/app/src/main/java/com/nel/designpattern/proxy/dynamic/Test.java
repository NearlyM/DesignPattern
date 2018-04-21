package com.nel.designpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Description :
 * CreateTime : 2018/4/21 11:09
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class Test {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject o = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, dynamicProxy);
        o.visit();
    }
}
