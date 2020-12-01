package com.qsn.eurekaclient.controller;


import com.qsn.eurekaclient.entity.User;
import com.qsn.eurekaclient.service.UserService;
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
    private UserService userService;

    /**
     * 用户表列表
     *
     * @param user 分页参数及查询条件
     * @return 分页信息
     */
    @PostMapping("/user/list")
    public List<User>listUser(@RequestBody User user) throws Exception {
        System.out.println("---------------------client信息---------------------");
        List<User> list = userService.listUser(user);
        System.out.println("用户信息---------------------------："+list);
//        if(true){
//            throw new Exception();
//        }
        return list;
    }


}
