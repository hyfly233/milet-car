package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 充值交易记录
    */
@Data
@Builder
public class PassengerWalletRecord {
    private Integer id;

    /**
    * 用户ID
    */
    private Integer passengerInfoId;

    /**
    * 第三方支付ID
    */
    private String transactionId;

    /**
    * 支付时间
    */
    private Date payTime;

    /**
    * 本金
    */
    private Double payCapital;

    /**
    * 赠费
    */
    private Double payGiveFee;

    /**
    * 退款本金
    */
    private Double refundCapital;

    /**
    * 退款赠费
    */
    private Double refundGiveFee;

    /**
    * 充值折扣
    */
    private Double rechargeDiscount;

    /**
    * 1：微信 ，2：账户余额，3：平台账户，4：支付宝
    */
    private Byte payType;

    /**
    * 1：已支付 ，0：未支付
    */
    private Byte payStatus;

    /**
    * 交易类型：
1充值
2消费
3退款
4订单冻结
5订单补扣
6尾款支付
7解冻
    */
    private Byte tradeType;

    /**
    * 交易原因
    */
    private String tradeReason;

    /**
    * 描述
    */
    private String description;

    /**
    * 创建用户
    */
    private String createUser;

    /**
    * 订单Id
    */
    private Integer orderId;

    /**
    * 创建时间
    */
    private Date createTime;

    private Date updateTime;
}