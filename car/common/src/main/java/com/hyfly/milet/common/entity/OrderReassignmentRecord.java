package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单改派
    */
@Data
@Builder
public class OrderReassignmentRecord {
    private Integer id;

    /**
    * 订单Id
    */
    private Integer orderId;

    /**
    * 原司机Id
    */
    private Integer driverIdBefore;

    /**
    * 原司机姓名
    */
    private String driverNameBefore;

    /**
    * 当前司机ID
    */
    private Integer driverIdNow;

    /**
    * 当前司机name
    */
    private String driverNameNow;

    /**
    * 操作者
    */
    private String operator;

    /**
    * 改派原因
    */
    private Integer reasonType;

    /**
    * 改派内容
    */
    private String reasonText;

    private Date createTime;

    private Date updateTime;
}