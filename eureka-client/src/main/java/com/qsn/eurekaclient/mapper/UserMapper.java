package com.qsn.eurekaclient.mapper;

import com.qsn.eurekaclient.entity.User;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author qiusn
 * @date 2020-11-17
 */
public interface UserMapper {

    /**
     * 分页
     *
     * @param user 查询条件
     * @return 分页信息
     */
    List<User> listPageUser(User user);

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
     * @return 影响记录行数
     */
    int insertUser(User user);

    /**
     * 修改
     *
     * @param user 主键、待修改信息
     * @return 影响记录行数
     */
    int updateUserById(User user);


    /**
     * 详情
     *
     * @param user 根据主键获取详情
     * @return 详情
     */
    User getUserById(User user);

}
