package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 车辆级别列表
    */
@Data
@Builder
public class CarLevel {
    private Integer id;

    /**
    * 车辆级别标签
    */
    private String label;

    /**
    * 车型图标
    */
    private String icon;

    private Date createTime;

    private Date updateTime;

    /**
    * 操作人ID
    */
    private Integer operatorId;

    /**
    * 状态:0未启用1启用
    */
    private Byte enable;
}