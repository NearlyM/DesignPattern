package com.nel.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description :
 * CreateTime : 2018/4/21 11:06
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 11:06
 * @ModifyDescription :
 */

public class DynamicProxy implements InvocationHandler {

    Object object;

    DynamicProxy(Object o) {
        object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
