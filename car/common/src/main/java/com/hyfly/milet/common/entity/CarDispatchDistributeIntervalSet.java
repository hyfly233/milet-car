package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度派单间隔设置
    */
@Data
@Builder
public class CarDispatchDistributeIntervalSet {
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
    * 用车服务前间隔（分钟）
    */
    private Integer carServiceBeforeInterval;

    /**
    * 用车服务后间隔（分钟）
    */
    private Integer carServiceAfterInterval;

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