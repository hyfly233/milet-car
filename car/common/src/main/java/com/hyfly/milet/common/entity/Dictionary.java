package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

/**
    * 字典表
    */
@Data
@Builder
public class Dictionary {
    /**
    * id
    */
    private Integer id;

    /**
    * 父id
    */
    private Integer dicParentid;

    /**
    * 类型
    */
    private String dicType;

    private String dicName;

    /**
    * 值
    */
    private String dicValue;

    /**
    * 描述
    */
    private String dicDesc;

    /**
    * 排序
    */
    private Integer dicOrder;

    private String dicStatus;
}