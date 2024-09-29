package com.pfc.pfcl.domain.strategy.repository;

import com.pfc.pfcl.domain.strategy.model.aggregates.StrategyRich;
import com.pfc.pfcl.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);
}
