package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度运力设置
    */
@Data
@Builder
public class CarDispatchCapacitySet {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 城市编码
    */
    private String cityCode;

    /**
    * 车辆服务时段 1白天2夜晚
    */
    private Boolean carServicePeriod;

    /**
    * 空闲司机数量
    */
    private Integer spareDriverCount;

    /**
    * 操作人id
    */
    private Integer operatorId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}