package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 优惠券类型表
    */
@Data
@Builder
public class CouponClass {
    private Integer id;

    /**
    * 优惠方式:1现金券,2折扣券
    */
    private Byte couponType;

    /**
    * 优惠券名称
    */
    private String couponName;

    /**
    * 抵扣金额
    */
    private BigDecimal reductionAmount;

    /**
    * 折扣比例(8, 7.5)
    */
    private BigDecimal discount;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 最后修改人id
    */
    private Integer operatorId;

    /**
    * 暂停:0否1是
    */
    private Byte isPause;
}