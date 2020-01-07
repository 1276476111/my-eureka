package com.qsn.eurekaconsumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * 服务消费者，调用服务提供者提供的服务，实现业务
 *
 * @author qiusn
 */
@FeignClient(value = "eureka-client") // 调用的服务的名称
public interface EurekaFeignService {
 
    @RequestMapping(value = "/info")
    String getInfo();
 
}