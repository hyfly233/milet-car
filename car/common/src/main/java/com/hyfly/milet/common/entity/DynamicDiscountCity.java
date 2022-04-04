package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 动态调价城市表
    */
@Data
@Builder
public class DynamicDiscountCity {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 动态折扣关联id
    */
    private Integer dynamicDiscountRuleId;

    /**
    * 城市编码
    */
    private String cityCode;

    /**
    * 是否删除 0不删除 1删除
    */
    private Integer isDelete;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}