package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户优惠券表
    */
@Data
@Builder
public class UserCoupon {
    /**
    * 领取记录ID
    */
    private Integer id;

    /**
    * 乘客ID
    */
    private Integer passengerId;

    /**
    * 电话号码
    */
    private String phoneNumber;

    /**
    * 关联订单号
    */
    private String orderId;

    /**
    * 优惠券ID
    */
    private Integer couponId;

    private String couponName;

    /**
    * 优惠券类型 1:现金券, 2:专项券-免费送车券, 3:专项券-免费还车券 4:折扣券
    */
    private Byte couponType;

    /**
    * 	1,主动发放. 2,用户获取
    */
    private Byte getMethod;

    /**
    * 优惠券起效时间
    */
    private Date enableTime;

    /**
    * 获取时间
    */
    private Date createTime;

    /**
    * 过期时间
    */
    private Date expireTime;

    /**
    * 使用时间
    */
    private Date updateTime;

    /**
    * 使用时间
    */
    private Date useTime;

    /**
    * 状态 0:未使用, 1:已使用
    */
    private Byte isUse;

    /**
    * 最低消费金额
    */
    private BigDecimal minimumAmount;

    /**
    * 减免金额(现金券：能抵扣的金额,折扣券：最高能抵扣的金额)
    */
    private BigDecimal reductionAmount;

    /**
    * 折扣8,7.5
    */
    private BigDecimal discount;

    /**
    * 功能类型 1:市场活动, 2:订单赔付
    */
    private Integer functionType;

    /**
    * 赔付记录ID
    */
    private Integer indemnityRecordId;

    /**
    * 活动标签
    */
    private String activityTag;

    /**
    * 活动ID
    */
    private Integer activityId;
}