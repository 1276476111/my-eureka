package com.qsn.eurekaclient.service;

import com.qsn.eurekaclient.common.PageData;
import com.qsn.eurekaclient.common.PageForm;
import com.qsn.eurekaclient.entity.User;

import java.util.List;

/**
 * 服务接口
 *
 * @author qiusn
 * @date 2020-11-17
 */
public interface UserService {

    /**
     * 分页
     *
     * @param pageForm 分页参数及查询条件
     * @return 分页信息
     */
    PageData<User> listPageUser(PageForm<User> pageForm);

    /**
     * 列表
     *
     * @param user 查询条件
     * @return 列表信息
     */
    List<User> listUser(User user);

    /**
     * 新增
     *
     * @param user 新增信息
     * @return 成功或失败
     */
    boolean insertUser(User user);

    /**
     * 修改
     *
     * @param user 根据主键修改信息
     * @return 成功或失败
     */
    boolean updateUserById(User user);

    /**
     * 详情
     *
     * @param user 根据主键获取详情
     * @return 详情
     */
    User getUserById(User user);

}
