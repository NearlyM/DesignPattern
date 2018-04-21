package com.nel.designpattern.templete;

import java.util.List;

/**
 * Description :
 * CreateTime : 2018/4/21 10:02
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/21 10:02
 * @ModifyDescription :
 */

public class ChinaResponse extends BaseResponse {

    private List<String> provices;

    public List<String> getProvices() {
        return provices;
    }

    public void setProvices(List<String> provices) {
        this.provices = provices;
    }
}
