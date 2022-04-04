package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 动态折扣信息表
    */
@Data
@Builder
public class DynamicDiscountInfo {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 动态折扣关联id
    */
    private Integer dynamicDiscountRuleId;

    /**
    * 里程
    */
    private Double km;

    /**
    * 折扣
    */
    private Double discount;

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