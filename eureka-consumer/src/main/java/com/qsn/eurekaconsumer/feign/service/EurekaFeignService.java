package com.qsn.eurekaconsumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * 服务消费者，调用服务提供者提供的服务，实现业务
 *
 * @author qiusn
 * @date 2020-07-27
 */
@FeignClient(value = "eureka-client")
public interface EurekaFeignService {

    /**
     * 测试服务消费
     *
     * @return 自定义字符串
     */
    @RequestMapping(value = "/info")
    String getClientInfo();
 
}