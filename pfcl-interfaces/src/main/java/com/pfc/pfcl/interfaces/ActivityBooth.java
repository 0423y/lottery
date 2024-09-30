package com.pfc.pfcl.interfaces;


import com.pfc.pfcl.common.Constants;
import com.pfc.pfcl.common.Result;
import com.pfc.pfcl.infrastructure.dao.IActivityDao;
import com.pfc.pfcl.infrastructure.po.Activity;
import com.pfc.pfcl.rpc.IActivityBooth;
import com.pfc.pfcl.rpc.dto.ActivityDto;
import com.pfc.pfcl.rpc.req.ActivityReq;
import com.pfc.pfcl.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;


/**
 * @author ypf
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}
