package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度派发设置
    */
@Data
@Builder
public class CarDispatchDistributeSet {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 城市编码
    */
    private String cityCode;

    /**
    * 是否开启强派 0不开启 1开启
    */
    private Boolean isForceDistribute;

    /**
    * 操作人id
    */
    private Integer operatorId;

    /**
    * 创建时间
    */
    private Date createTime;

    private Date updateTime;
}