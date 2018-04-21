package com.nel.designpattern.templete;

import java.util.List;

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

public class AmericaResponse extends BaseResponse {

    private List<String> states;

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }
}
