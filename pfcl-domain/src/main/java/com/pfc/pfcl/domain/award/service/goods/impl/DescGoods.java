package com.pfc.pfcl.domain.award.service.goods.impl;

import com.pfc.pfcl.common.Constants;
import com.pfc.pfcl.domain.award.model.req.GoodsReq;
import com.pfc.pfcl.domain.award.model.res.DistributionRes;
import com.pfc.pfcl.domain.award.service.goods.DistributionBase;
import com.pfc.pfcl.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @description  描述类商品，以文字形式展示给用户
 * @author ypf
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
