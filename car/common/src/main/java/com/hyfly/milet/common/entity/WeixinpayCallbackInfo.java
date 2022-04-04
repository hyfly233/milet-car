package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 微信支付信息表
    */
@Data
@Builder
public class WeixinpayCallbackInfo {
    private Integer id;

    /**
    * 微信订单号
    */
    private String transactionId;

    /**
    * 商户订单号
    */
    private String outTradeNo;

    private Integer totalFee;

    private String body;

    /**
    * 业务结果
    */
    private String resultCode;

    /**
    * 错误代码
    */
    private String errCode;

    /**
    * 用户标识
    */
    private String openid;

    /**
    * 交易类型
    */
    private String tradeType;

    /**
    * 付款银行
    */
    private String bankType;

    /**
    * 支付完成时间
    */
    private Date timeEnd;

    private String attach;

    /**
    * 订单类型 1："充值" ， 3："订单"， 4："缴纳押金"  6："违章缴费"
    */
    private Integer orderType;

    /**
    * 订单状态 1：未支付 ，2：已支付
    */
    private Integer status;

    /**
    * 商户ID
    */
    private String mchId;

    /**
    * 来源iOS，Android
    */
    private String source;

    private Date createTime;

    private Date updateTime;
}