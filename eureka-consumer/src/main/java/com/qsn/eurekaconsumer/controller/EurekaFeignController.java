package com.qsn.eurekaconsumer.controller;

import com.qsn.eurekaconsumer.feign.service.EurekaFeignService;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 服务消费控制器类，对用户提供服务
 *
 * @author qiusn
 * @date 2020-07-27
 */
@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/feignInfo")
    public String feignInfo() throws Exception {

        // Open-Feign 方式调用
//        String message = eurekaFeignService.getClientInfo();

        // ribbon调用（使用默认策略）
        // 这里使用微服务的名字, ribbon默认使用轮询策略， 如果要自定义负载均衡策略需要添加配置文件和配置类
        // 第一部分指出正在调用什么HTTP方法，第二部分指示返回的内容。
//        String url = "http://eureka-client/info";
//        String message = restTemplate.getForObject(url, String.class);

        // ribbon调用（自定义负载均衡策略）
        String url = "http://eureka-client/info";
//        // 随机访问策略
//        loadBalancerClient.choose("server-client");
        // 进行请求
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url , String.class);
        String message = responseEntity.getBody();

        return "获取到的信息:" + message;
    }

}