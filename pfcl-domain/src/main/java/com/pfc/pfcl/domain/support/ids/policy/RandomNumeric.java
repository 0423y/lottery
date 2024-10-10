package com.pfc.pfcl.domain.support.ids.policy;

import com.pfc.pfcl.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @description 工具类生成 org.apache.commons.lang3.RandomStringUtils
 * @author ypf
 */
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }

}
