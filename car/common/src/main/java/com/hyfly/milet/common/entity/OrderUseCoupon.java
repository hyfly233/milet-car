package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单优惠券使用记录
    */
@Data
@Builder
public class OrderUseCoupon {
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 优惠券Id
    */
    private Integer couponId;

    /**
    * 0:预估 1，实际
    */
    private String category;

    /**
    * 优惠券金额
    */
    private Double couponMoney;

    /**
    * 使用优惠券后订单金额
    */
    private Double afterUseCouponMoeny;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}