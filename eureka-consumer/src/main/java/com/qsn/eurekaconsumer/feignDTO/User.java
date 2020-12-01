package com.qsn.eurekaconsumer.feignDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author qiusn
 * @date 2020-11-17
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer age;

}