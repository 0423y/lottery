package com.pfc.pfcl.infrastructure.dao;


import com.pfc.pfcl.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author ypf
 */
@Mapper
public interface IAwardDao {

    /**
     * 查询奖品信息
     *
     * @param awardId 奖品ID
     * @return        奖品信息
     */
    Award queryAwardInfo(String awardId);

}
