package com.qsn.eurekaclient.service.impl;

import com.github.pagehelper.PageHelper;
import com.qsn.eurekaclient.common.PageData;
import com.qsn.eurekaclient.common.PageForm;
import com.qsn.eurekaclient.entity.User;
import com.qsn.eurekaclient.mapper.UserMapper;
import com.qsn.eurekaclient.service.UserService;
import com.qsn.eurekaclient.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 服务实现类
 *
 * @author qiusn
 * @date 2020-11-17
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public PageData<User> listPageUser(PageForm<User> pageForm) {
        PageHelper.startPage(pageForm.getCurrentPage(), pageForm.getPageSize());
        List<User> userList = userMapper.listPageUser(pageForm.getData());
        return PageUtil.setPageInfo(userList);
    }

    @Override
    public List<User> listUser(User user) {
        return userMapper.listUser(user);
    }

    @Override
    public boolean insertUser(User user) {
        int insertNum = userMapper.insertUser(user);
        return insertNum == 1 ? true : false;
    }

    @Override
    public boolean updateUserById(User user) {
        int updateNum = userMapper.updateUserById(user);
        return updateNum == 1 ? true : false;
    }

    @Override
    public User getUserById(User user) {
        return userMapper.getUserById(user);
    }


}
