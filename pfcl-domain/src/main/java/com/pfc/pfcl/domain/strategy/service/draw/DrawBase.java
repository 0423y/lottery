package com.pfc.pfcl.domain.strategy.service.draw;



import com.pfc.pfcl.domain.strategy.model.vo.AwardRateInfo;
import com.pfc.pfcl.domain.strategy.service.algorithm.IDrawAlgorithm;
import com.pfc.pfcl.infrastructure.po.StrategyDetail;

import java.util.ArrayList;
import java.util.List;

/**

 */
public class DrawBase extends DrawConfig {

    public void checkAndInitRateData(Long strategyId, Integer strategyMode, List<StrategyDetail> strategyDetailList) {
        if (1 != strategyMode) return;
        IDrawAlgorithm drawAlgorithm = drawAlgorithmGroup.get(strategyMode);

        boolean existRateTuple = drawAlgorithm.isExistRateTuple(strategyId);
        if (existRateTuple) return;

        List<AwardRateInfo> awardRateInfoList = new ArrayList<>(strategyDetailList.size());
        for (StrategyDetail strategyDetail : strategyDetailList) {
            awardRateInfoList.add(new AwardRateInfo(strategyDetail.getAwardId(), strategyDetail.getAwardRate()));
        }

        drawAlgorithm.initRateTuple(strategyId, awardRateInfoList);

    }

}
