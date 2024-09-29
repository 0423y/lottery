package com.pfc.pfcl.domain.strategy.service.draw;


import com.pfc.pfcl.domain.strategy.model.req.DrawReq;
import com.pfc.pfcl.domain.strategy.model.res.DrawResult;

/**
 对外提供的抽奖接口
 */
public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);

}
