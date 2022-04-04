package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度时间阈值设置
    */
@Data
@Builder
public class CarDispatchTimeThresholdSet {
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
    * 时间阈值类型 1开启立即用车派单逻辑 2预约用车待派订单开启强派模式
    */
    private Boolean timeThresholdType;

    /**
    * 时间阈值（分钟）
    */
    private Integer timeThreshold;

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