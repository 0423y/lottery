package com.pfc.pfcl.domain.strategy.service.draw;


import com.pfc.pfcl.domain.strategy.model.aggregates.StrategyRich;
import com.pfc.pfcl.domain.strategy.model.vo.AwardBriefVO;
import com.pfc.pfcl.domain.strategy.repository.IStrategyRepository;


import javax.annotation.Resource;

/**
 * &#064;description:抽奖策略的数据支持，一些通用的数据服务，通过继承该类使用其方法
 * @author ypf
 */
public class DrawStrategySupport extends DrawConfig{

    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     *
     * @param strategyId    策略ID
     * @return              策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId){
        return strategyRepository.queryStrategyRich(strategyId);
    }

    protected AwardBriefVO queryAwardInfoByAwardId(String awardId){
        return strategyRepository.queryAwardInfo(awardId);

    }
}
