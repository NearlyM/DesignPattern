package com.nel.designpattern.templete;

/**
 * Description :
 * CreateTime : 2018/4/21 10:04
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 10:04
 * @ModifyDescription :
 */

public class AmeriaServiceImpl extends BaseService<AmericaResponse> {

    @Override
    public Result<AmericaResponse> handle() {
        return super.handle();
    }

    @Override
    protected AmericaResponse initResponse() {
        return new AmericaResponse();
    }
}
