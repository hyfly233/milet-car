package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度顺风单半径设置
    */
@Data
@Builder
public class CarDispatchDirectRouteOrderRadiusSet {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 城市编码
    */
    private String cityCode;

    /**
    * 服务类型id
    */
    private Integer serviceTypeId;

    /**
    * 顺风单类型 1回家单 2接力单 3特殊时段预约单
    */
    private Boolean directRouteOrderType;

    /**
    * 顺风单半径（公里）
    */
    private Integer directRouteOrderRadius;

    /**
    * 是否删除 0未删除 1已删除
    */
    private Boolean isDelete;

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