package com.qsn.eurekaconsumer.controller;

import com.qsn.eurekaconsumer.feign.service.EurekaFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/feignInfo")
    public String feignInfo() throws Exception {

        String message = eurekaFeignService.getInfo();
//        if(true){
//            throw new Exception("测试啊");
//        }
        return "获取到的信息:" + message;
    }

}