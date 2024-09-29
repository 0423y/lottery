package com.pfc.pfcl.infrastructure.dao;


import com.pfc.pfcl.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);

}
