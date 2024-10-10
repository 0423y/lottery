package com.pfc.pfcl.domain.support.ids;

import com.pfc.pfcl.domain.support.ids.policy.RandomNumeric;
import com.pfc.pfcl.domain.support.ids.policy.ShortCode;
import com.pfc.pfcl.domain.support.ids.policy.SnowFlake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.pfc.pfcl.common.Constants;
import java.util.HashMap;
import java.util.Map;

/**
 * @description Id 策略模式上下文配置「在正式的完整的系统架构中，ID 的生成会有单独的服务来完成，其他服务来调用 ID 生成接口即可」
 *                 通过配置注解 @Configuration 和 Bean 对象的生成 @Bean，来把策略生成ID服务包装到 Map<Constants.Ids, IIdGenerator> 对象中。
 * @author ypf
 */
@Configuration
public class IdContext {

    /**
     * 创建 ID 生成策略对象，属于策略设计模式的使用方式
     *
     * @param snowFlake 雪花算法，长码，大量
     * @param shortCode 日期算法，短码，少量，全局唯一需要自己保证
     * @param randomNumeric 随机算法，短码，大量，全局唯一需要自己保证
     * @return IIdGenerator 实现类
     */
    @Bean
    public Map<Constants.Ids, IIdGenerator> idGenerator(SnowFlake snowFlake, ShortCode shortCode, RandomNumeric randomNumeric) {
        Map<Constants.Ids, IIdGenerator> idGeneratorMap = new HashMap<>(8);
        idGeneratorMap.put(Constants.Ids.SnowFlake, snowFlake);
        idGeneratorMap.put(Constants.Ids.ShortCode, shortCode);
        idGeneratorMap.put(Constants.Ids.RandomNumeric, randomNumeric);
        return idGeneratorMap;
    }

}
