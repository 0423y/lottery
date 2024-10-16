package com.pfc.pfcl.domain.rule.service.logic.impl;

import com.pfc.pfcl.domain.rule.model.req.DecisionMatterReq;
import com.pfc.pfcl.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 年龄规则
 * @author: ypf
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }

}
