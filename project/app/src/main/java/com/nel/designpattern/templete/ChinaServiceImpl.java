package com.nel.designpattern.templete;

/**
 * Description :
 * CreateTime : 2018/4/21 10:03
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 10:03
 * @ModifyDescription :
 */

public class ChinaServiceImpl extends BaseService<ChinaResponse> {

    @Override
    public Result<ChinaResponse> handle() {
        return super.handle();
    }

    @Override
    protected ChinaResponse initResponse() {
        return new ChinaResponse();
    }
}
