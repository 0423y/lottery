package com.pfc.pfcl.domain.activity.service.partake;


import com.pfc.pfcl.common.Result;
import com.pfc.pfcl.domain.activity.model.req.PartakeReq;
import com.pfc.pfcl.domain.activity.model.res.PartakeResult;
import com.pfc.pfcl.domain.activity.model.vo.DrawOrderVO;

/**
 * @description 抽奖活动参与接口
 * @author ypf
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);

}
