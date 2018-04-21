package com.nel.designpattern.templete;

/**
 * Description :
 * CreateTime : 2018/4/21 9:57
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 9:57
 * @ModifyDescription :
 */

public class Result<T> {
    private T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
