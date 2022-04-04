package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 优惠券配置表
    */
@Data
@Builder
public class Coupon {
    /**
    * 优惠券id
    */
    private Integer id;

    /**
    * 优惠券状态 0:禁用, 1:启用
    */
    private Integer status;

    /**
    * 优惠券名称
    */
    private String couponName;

    /**
    * 优惠券描述
    */
    private String couponDesc;

    /**
    * 优惠方式 1:现金券, 3:专项券-免费送车券, 4:专项券-免费还车券 2:折扣券
    */
    private Integer couponType;

    /**
    * 优惠券类型ID
    */
    private Integer couponClassId;

    /**
    * 优惠券类型名称
    */
    private String couponClassName;

    /**
    * 1,主动发放. 2,用户获取
    */
    private Byte getMethod;

    /**
    * 订单最低金额
    */
    private BigDecimal minimumAmount;

    /**
    * 减免金额 仅现金券有此项
    */
    private BigDecimal reductionAmount;

    /**
    * 最高抵扣金额
    */
    private BigDecimal maximumAmount;

    /**
    * 折扣比例
    */
    private BigDecimal discount;

    /**
    * 有效期类型 1：天数 ，2：时间段
    */
    private Byte effectiveType;

    /**
    * 有效期天数
    */
    private Short effectiveDay;

    /**
    * 有效期开始时间
    */
    private Date enableTime;

    /**
    * 有效期结束时间
    */
    private Date expireTime;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 创建用户
    */
    private String createUser;

    /**
    * 功能类型 1:市场活动, 2:订单赔付
    */
    private Integer functionType;

    /**
    * 总数量
    */
    private Integer totalNumber;

    /**
    * 已获取
    */
    private Integer getNumber;

    /**
    * 已使用
    */
    private Integer usedNumber;

    /**
    * 操作人ID
    */
    private Integer operatorId;
}