package com.nel.designpattern.proxy.stati;

/**
 * Description :
 * CreateTime : 2018/4/21 10:21
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 10:21
 * @ModifyDescription :
 */

public class ProxySubject implements Subject {

    Subject realSubject;

    ProxySubject(Subject subject) {
        realSubject = subject;
    }

    @Override
    public void visit() {
        realSubject.visit();
    }
}
