package com.qsn.eurekaclient.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 分页请求参数
 *
 * @author qiusn
 * @date 2020-08-06
 */
@Getter
@Setter
@ToString
@ApiModel(value = "PageForm", description = "分页信息")
public class PageForm<T> implements Serializable {

    private static final long serialVersionUID = 3072160751379138434L;

    @ApiModelProperty(value = "当前页是第几页", position = 1, required = true)
    private Integer currentPage;

    @ApiModelProperty(value = "每页多少条数据", position = 2, required = true)
    private Integer pageSize;

    @ApiModelProperty(value = "总页数", position = 3)
    private Integer totalPages;

    @ApiModelProperty(value = "总记录数", position = 4)
    private Long totalRows;

    @ApiModelProperty(value = "入参实体", position = 5, required = true)
    private T data;


    public Integer getCurrentPage() {
        return this.currentPage = "".equals(currentPage) || currentPage == null || currentPage == 0 ? 1 : currentPage;
    }
    public Integer getPageSize() {
        return this.pageSize = "".equals(pageSize) || pageSize == null || pageSize == 0 ? 10 : pageSize;
    }

}
