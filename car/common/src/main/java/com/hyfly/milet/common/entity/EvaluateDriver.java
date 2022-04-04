package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 客户的订单评价表
    */
@Data
@Builder
public class EvaluateDriver {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 分数
    */
    private Integer grade;

    /**
    * 评价内容
    */
    private String content;

    /**
    * 订单ID
    */
    private Integer orderId;

    /**
    * 乘客ID
    */
    private Integer passengerId;

    /**
    * 司机ID
    */
    private Integer driverId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}