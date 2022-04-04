package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 支付宝回调信息表
    */
@Data
@Builder
public class AlipayCallbackInfo {
    private Integer id;

    /**
    * 通知时间
    */
    private String notifyTime;

    /**
    * 通知类型
    */
    private String notifyType;

    /**
    * 通知校验ID
    */
    private String notifyId;

    /**
    * 支付宝分配给开发者的应用ID
    */
    private String appId;

    /**
    * CHARSET
    */
    private String charset;

    /**
    * 接口版本
    */
    private String version;

    /**
    * 签名类型
    */
    private String signType;

    /**
    * 签名
    */
    private String sign;

    /**
    * 支付宝交易号
    */
    private String tradeNo;

    /**
    * 商户订单号
    */
    private String outTradeNo;

    /**
    * 商户业务号
    */
    private String outBizNo;

    /**
    * 买家支付宝用户号
    */
    private String buyerId;

    /**
    * 买家支付宝账号
    */
    private String buyerLogonId;

    /**
    * 卖家支付宝用户号
    */
    private String sellerId;

    /**
    * 卖家支付宝账号
    */
    private String sellerEmail;

    /**
    * 交易状态
    */
    private String tradeStatus;

    /**
    * 订单金额
    */
    private String totalAmount;

    /**
    * 实收金额
    */
    private String receiptAmount;

    /**
    * 开票金额
    */
    private String invoiceAmount;

    /**
    * 付款金额
    */
    private String buyerPayAmount;

    /**
    * 集分宝金额
    */
    private String pointAmount;

    /**
    * 总退款金额
    */
    private String refundFee;

    /**
    * 订单标题
    */
    private String subject;

    /**
    * 商品描述
    */
    private String body;

    /**
    * 交易创建时间
    */
    private String gmtCreate;

    /**
    * 交易付款时间
    */
    private String gmtPayment;

    /**
    * 交易退款时间
    */
    private String gmtRefund;

    /**
    * 交易结束时间
    */
    private String gmtClose;

    /**
    * 支付金额信息
    */
    private String fundBillList;

    /**
    * 回传参数
    */
    private String passbackParams;

    /**
    * 优惠券信息
    */
    private String voucherDetailList;

    private Date createTime;

    private Date updateTime;
}