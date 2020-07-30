package com.qsn.eurekaconsumer.config.ribbbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon的负载均衡
 *
 * @author qiusn
 * @date 2020-07-29
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 通过 @LoadBalanced 开启负载均衡， 这样就可以通过微服务名字从eureka中找到对应的服务了
     * @return 可通过微服务名字进行http请求访问的 RestTemplate 模板
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
