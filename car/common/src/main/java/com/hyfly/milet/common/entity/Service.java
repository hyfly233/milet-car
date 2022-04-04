package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Service {
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
    * 同时可下单数量
    */
    private Integer togetherOrderNumber;

    /**
    * 服务开启状态 0暂停 1开启
    */
    private Integer serviceStatus;

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