package com.qsn.eurekaconsumer.feign.service;

import com.qsn.eurekaconsumer.feignDTO.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    /**
     * 用户表列表
     *
     * @param user 查询条件
     * @return 列表信息
     */
    @PostMapping(value = "/user/list")
    List<User> listUser(@RequestBody User user);

}