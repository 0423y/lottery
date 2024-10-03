package com.pfc.pfcl.infrastructure.dao;

import com.pfc.pfcl.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: ypf
 * @description: 活动信息表DAO
 */
@Mapper
public interface IActivityDao {

    /**
     * 插入数据
     * @param req 入参
     */
    void insert(Activity req);

    /**
     * 根据活动号查询活动信息
     *
     * @param activityId 活动号
     * @return           活动信息
     */
    Activity queryActivityById(Long activityId);

}
