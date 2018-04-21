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

public abstract class BaseService<T> {

    public Result<T> handle() {
        Result<T> result = new Result<>();
        result.setResponse(getResponse());
        return result;
    }

    private T getResponse() {
        return initResponse();
    }

    protected abstract T initResponse();
}
