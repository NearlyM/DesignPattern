package com.nel.designpattern.proxy.dynamic;

/**
 * Description :
 * CreateTime : 2018/4/21 11:05
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 11:05
 * @ModifyDescription :
 */

public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.print("i am realSubject");
    }
}
