package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 计费规则时间段表
    */
@Data
@Builder
public class ChargeRuleDetail {
    private Integer id;

    private Integer ruleId;

    /**
    * 时间段开始
    */
    private Integer start;

    /**
    * 时间段结束
    */
    private Integer end;

    /**
    * 超公里单价
    */
    private Double perKiloPrice;

    /**
    * 超时间单价
    */
    private Double perMinutePrice;

    /**
    * 是否删除 0未删除 1已删除
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