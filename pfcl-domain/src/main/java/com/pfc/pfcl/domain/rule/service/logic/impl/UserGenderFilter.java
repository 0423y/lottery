package com.pfc.pfcl.domain.rule.service.logic.impl;

import com.pfc.pfcl.domain.rule.model.req.DecisionMatterReq;
import com.pfc.pfcl.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 性别规则
 * @author: ypf
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
    
}
