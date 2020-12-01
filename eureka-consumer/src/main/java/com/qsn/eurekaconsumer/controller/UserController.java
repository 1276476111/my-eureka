package com.qsn.eurekaconsumer.controller;


import com.qsn.eurekaconsumer.feign.service.EurekaFeignService;
import com.qsn.eurekaconsumer.feignDTO.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表 前端控制器
 *
 * @author qiusn
 * @date 2020-11-30
 */
@RestController
public class UserController {

    @Resource
    private EurekaFeignService feignUserService;
    @Resource
    private RestTemplate restTemplate;

    /**
     * 用户表列表
     *
     * @param user 分页参数及查询条件
     * @return 分页信息
     */
    @PostMapping("/user/list")
    public List<User> listPageUser(@RequestBody User user) {

        // ribbon调用
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://eureka-client/user/list", user, String.class);
        responseEntity.getBody();
        System.out.println("ribbon调用-----------------------: " + responseEntity.getBody());

        // feign调用
        List<User> users = feignUserService.listUser(user);
        System.out.println("feign调用-----------------------: " + users);


        return null;
    }


}
