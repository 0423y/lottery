package com.pfc.pfcl.infrastructure.dao;


import com.pfc.pfcl.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}
