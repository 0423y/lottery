package com.pfc.pfcl.domain.rule.service.engine;

import com.pfc.pfcl.domain.rule.model.req.DecisionMatterReq;
import com.pfc.pfcl.domain.rule.model.res.EngineResult;

/**
 * @description: 规则过滤器引擎
 * @author ypf
 */
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
