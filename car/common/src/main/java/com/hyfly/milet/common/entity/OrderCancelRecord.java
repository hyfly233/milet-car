package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单取消原因
    */
@Data
@Builder
public class OrderCancelRecord {
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 乘客是否有责0无责，1有责
    */
    private Integer isCharge;

    /**
    * 取消费
    */
    private Double cancelCost;

    /**
    * 取消原因类型 
1
2
3
4
    */
    private Integer reasonType;

    /**
    * 其他原因
    */
    private String reasonText;

    /**
    * 操作人
    */
    private Integer operator;

    /**
    * 操作人类型1:客户自行取消 2:客服取消
    */
    private Integer operatorType;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}