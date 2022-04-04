package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度派单半径设置
    */
@Data
@Builder
public class CarDispatchDistributeRadiusSet {
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
    * 最小派单半径（公里）
    */
    private Integer minRadius;

    /**
    * 最小派单半径首次推送司机数量
    */
    private Integer minRadiusFirstPushDriverCount;

    /**
    * 最大派单半径（公里）
    */
    private Integer maxRadius;

    /**
    * 最大派单半径首次推送司机数量
    */
    private Integer maxRadiusFirstPushDriverCount;

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