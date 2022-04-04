package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 城市表
    */
@Data
@Builder
public class City {
    private Integer id;

    /**
    * 城市名称
    */
    private String cityName;

    /**
    * 城市编码
    */
    private String cityCode;

    /**
    * 城市中心经纬度
    */
    private String cityLongitudeLatitude;

    /**
    * 下单风险上限值
    */
    private Integer orderRiskTop;

    /**
    * 是否开通 0未开通 1开通
    */
    private Integer cityStatus;

    /**
    * 操作人id
    */
    private Integer operatorId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}