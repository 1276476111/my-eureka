package com.qsn.eurekaconsumer.config.ribbbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 随机负载均衡策略
 *
 * @author qiusn
 * @date 2020-07-29
 */
@Configuration
public class RandomRuleConfig {

    /**
     * 实例化与配置文件对应的策略类
     * 下面的方法名要注意不能使用 myRule 这个名字， 否则会报定义了相同名字的错误
     *
     * @return 策略实例
     */
    @Bean
    public IRule getRandomRule() {
        return new RandomRule();
    }


}
