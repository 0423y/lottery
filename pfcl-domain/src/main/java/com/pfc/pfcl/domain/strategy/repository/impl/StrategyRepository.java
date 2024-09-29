package com.pfc.pfcl.domain.strategy.repository.impl;


import com.pfc.pfcl.domain.strategy.model.aggregates.StrategyRich;
import com.pfc.pfcl.domain.strategy.repository.IStrategyRepository;
import com.pfc.pfcl.infrastructure.dao.IAwardDao;
import com.pfc.pfcl.infrastructure.dao.IStrategyDao;
import com.pfc.pfcl.infrastructure.dao.IStrategyDetailDao;
import com.pfc.pfcl.infrastructure.po.Award;
import com.pfc.pfcl.infrastructure.po.Strategy;
import com.pfc.pfcl.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

}
