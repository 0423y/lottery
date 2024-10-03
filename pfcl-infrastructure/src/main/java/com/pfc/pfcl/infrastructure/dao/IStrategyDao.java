package com.pfc.pfcl.infrastructure.dao;


import com.pfc.pfcl.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: ypf
 * @description: 策略表DAO
 */
@Mapper
public interface IStrategyDao {

    /**
     * 查询策略配置
     *
     * @param strategyId 策略ID
     * @return           策略配置信息
     */
    Strategy queryStrategy(Long strategyId);

}
