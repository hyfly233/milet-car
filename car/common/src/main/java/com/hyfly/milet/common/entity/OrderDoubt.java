package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 调帐审核
    */
@Data
@Builder
public class OrderDoubt {
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 申诉单号
    */
    private String appealNumber;

    /**
    * 调账类型
1充值
2扣款
3发优惠券
    */
    private Integer adjustType;

    /**
    * 调账内容 充值| 扣款 单号，优惠券
    */
    private String adjustContent;

    /**
    * 疑义原因类型 
 1=>'提前计费',
 2=>'司要绕路',
 3=>'不明费用',
 4=>'其他问题',
    */
    private Integer reasonType;

    /**
    * 自定义其他疑义原因
    */
    private String reasonText;

    /**
    * 调账前金额
    */
    private BigDecimal oldCost;

    /**
    * 调账后金额
    */
    private BigDecimal nowCost;

    /**
    * 1待处理 
2待审核 
3已审核 
4已完成 
5已撤销 
    */
    private Integer status;

    /**
    * 处理类型
1充值
2扣款
3发优惠券
    */
    private Integer handleType;

    /**
    * 处理方案
    */
    private String solution;

    /**
    * 操作人 （多人操作全记录)
    */
    private String operators;

    /**
    * 操作时间
    */
    private Date operateTime;

    /**
    * 提交时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}