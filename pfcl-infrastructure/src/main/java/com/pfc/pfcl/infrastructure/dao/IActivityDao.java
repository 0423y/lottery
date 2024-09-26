package com.pfc.pfcl.infrastructure.dao;

import com.pfc.pfcl.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);

}
