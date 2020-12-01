package com.qsn.eurekaconsumer;

import com.qsn.eurekaconsumer.config.ribbbon.RandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 */
// 熔断
@EnableHystrix
// 启用 Eureka 服务发现
@EnableDiscoveryClient
// 启用 Feign
@EnableFeignClients(basePackages = "com.qsn.eurekaconsumer.feign")

/*
    使用自定义负载均衡策略有两种方式：
    二：启动类加 @RibbonClient(name="xxx" configuration="xxx")注解， 并且自定义一个Rule配置策略类
        name代表自定义的负载均衡是哪个提供者，configuration 代表使用的是哪个自定义负载均衡的类
        使用这个注解在启动该微服务的时候，就能去加载我们的自定义的Ribbon配置类，从而使配置类生效
 */
@RibbonClient(name = "eureka-consumer", configuration = RandomRuleConfig.class)
@SpringBootApplication
public class EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

}
