package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单支付表
    */
@Data
@Builder
public class OrderPayment {
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 支付类型：1微信，2账户余额，4支付宝
    */
    private Integer payType;

    /**
    * 总金额
    */
    private Double totalPrice;

    /**
    * 余额支付金额
    */
    private Double balancePrice;

    /**
    * 微信支付金额
    */
    private Double wechatPrice;

    /**
    * 支付宝金额
    */
    private Double alipayPrice;

    /**
    * 用户获得优惠券id,此时不是优惠券id，是用户优惠券关联id
    */
    private Integer userCouponId;

    /**
    * 优惠券减免金额
    */
    private Double couponReducePrice;

    /**
    * 已支付金额
    */
    private Double paidPrice;

    /**
    * 剩余支付的金额
    */
    private Double remainPrice;

    /**
    * 尾款价格
    */
    private Double tailPrice;

    /**
    * 补扣价格
    */
    private Double replenishPrice;

    /**
    * 支付时间
    */
    private Date payTime;

    private Date createTime;

    private Date updateTime;
}