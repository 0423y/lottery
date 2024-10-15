package com.pfc.pfcl.domain.activity.model.res;

import com.pfc.pfcl.common.Result;
/**
 * @description 活动参与结果
 * @author ypf
 */
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 活动领取ID
     */
    private Long takeId;


    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }


    public Long getTakeId() {
        return takeId;
    }

    public void setTakeId(Long takeId) {
        this.takeId = takeId;
    }
}
