package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆调度特殊时段设置
    */
@Data
@Builder
public class CarDispatchSpecialPeriodSet {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 城市编码
    */
    private String cityCode;

    private Integer serviceTypeId;

    /**
    * 时段设置
    */
    private String timePeriod;

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

    private Date updateTime;
}