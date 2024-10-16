package com.pfc.pfcl.application.process.res;

import com.pfc.pfcl.common.Result;
import com.pfc.pfcl.domain.strategy.model.vo.DrawAwardVO;

/**
 * @description 活动抽奖结果
 * @author ypf
 */
public class DrawProcessResult extends Result {

    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardInfo() {
        return drawAwardVO;
    }

    public void setDrawAwardInfo(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }
}
