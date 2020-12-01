package com.qsn.eurekaconsumer.feign.impl;

import com.qsn.eurekaconsumer.feign.service.EurekaFeignService;
import com.qsn.eurekaconsumer.feignDTO.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * EurekaFeignServiceFailure
 * 服务消费者，调用服务提供者提供的服务失败，回调处理类
 *
 * @author 宋陆
 * @version 1.0.0
 */
@Service
public class EurekaFeignServiceFailure implements EurekaFeignService {
 
    @Override
    public String getClientInfo() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }

    @Override
    public List<User> listUser(User user) {
//        System.out.println("---------------FeignService降级： 服务提供者提供的服务回调失败 --------------------");
        System.out.println("---------------FeignService降级： 服务无响应(有可能是Application中的 @EnableFeignClients 路径报错)--------------------");
        return new ArrayList<>();
    }

}