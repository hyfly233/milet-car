package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单调帐
    */
@Data
@Builder
public class OrderAdjustRecord {
    /**
    * ID
    */
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    private Integer doubtId;

    /**
    * 调账类型1,充值 2.扣款
    */
    private Integer adjustAccountType;

    /**
    * 充值|扣款 单号
    */
    private String chargeNumber;

    /**
    * 调账前金额
    */
    private BigDecimal oldCost;

    /**
    * 调账后金额
    */
    private BigDecimal newCost;

    /**
    * 调账原因id
    */
    private Integer reasonType;

    /**
    * 自定义调账原因
    */
    private String reasonText;

    /**
    * 处理方案
    */
    private String solution;

    /**
    * 操作人
    */
    private Integer operator;

    /**
    * create_time
    */
    private Date createTime;

    /**
    * update_time
    */
    private Date updateTime;
}