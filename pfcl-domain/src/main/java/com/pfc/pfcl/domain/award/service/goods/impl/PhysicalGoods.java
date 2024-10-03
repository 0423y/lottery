package com.pfc.pfcl.domain.award.service.goods.impl;

import com.pfc.pfcl.common.Constants;
import com.pfc.pfcl.domain.award.model.req.GoodsReq;
import com.pfc.pfcl.domain.award.model.res.DistributionRes;
import com.pfc.pfcl.domain.award.service.goods.DistributionBase;
import com.pfc.pfcl.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @description 实物类发货奖品
 * @author ypf
 */
@Component
public class PhysicalGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用实物发奖
        logger.info("模拟调用实物发奖 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
