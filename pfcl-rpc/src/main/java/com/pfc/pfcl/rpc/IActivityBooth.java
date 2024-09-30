package com.pfc.pfcl.rpc;


import com.pfc.pfcl.rpc.req.ActivityReq;
import com.pfc.pfcl.rpc.res.ActivityRes;


/**
 * @author ypf
 */
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);

}
