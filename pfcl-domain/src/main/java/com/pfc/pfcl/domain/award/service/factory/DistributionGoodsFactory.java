package com.pfc.pfcl.domain.award.service.factory;

import com.pfc.pfcl.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @author ypf
 * @description 配送商品简单工厂，提供获取配送服务
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}
