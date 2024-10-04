package com.pfc.pfcl.domain.strategy.repository;

import com.pfc.pfcl.domain.strategy.model.aggregates.StrategyRich;
import com.pfc.pfcl.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * @author ypf
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    AwardBriefVO queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);


    /**
     * 减少库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId,String awardId);
}


