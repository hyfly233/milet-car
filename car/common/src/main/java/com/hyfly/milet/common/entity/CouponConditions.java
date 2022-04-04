package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 优惠券使用条件限制表
    */
@Data
@Builder
public class CouponConditions {
    private Integer id;

    /**
    * 优惠券ID
    */
    private Integer couponId;

    /**
    * 小时集合
    */
    private String hourSet;

    /**
    * 周集合
    */
    private String weekSet;

    /**
    * 日期集合
    */
    private String dateSet;

    /**
    * 城市集合
    */
    private String citySet;

    /**
    * 车辆类型集合
    */
    private String carSet;

    /**
    * 服务集合
    */
    private String serviceSet;

    private String levelSet;

    /**
    * 时段原始数据
    */
    private String hourRaw;

    /**
    * 日期原始数据
    */
    private String dateRaw;

    private Date createTime;
}