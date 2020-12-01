package com.qsn.eurekaclient.util;


import com.github.pagehelper.PageInfo;
import com.qsn.eurekaclient.common.PageData;

import java.util.List;

/**
 * 分页工具
 *
 * @author qiusn
 * @date 2020-08-06
 */
public class PageUtil {

    /**
     * 设置分页返回参数
     *
     * @param list
     * @return 分页总数、当前页数、每页的记录数
     */
    public static <T> PageData<T> setPageInfo(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        PageData<T> page = new PageData<>();
        page.setCurrentPage(pageInfo.getPageNum());
        page.setPageSize(pageInfo.getPageSize());
        page.setTotalRows(pageInfo.getTotal());
        page.setTotalPages(pageInfo.getPages());
        page.setData(list);
        return page;
    }

}