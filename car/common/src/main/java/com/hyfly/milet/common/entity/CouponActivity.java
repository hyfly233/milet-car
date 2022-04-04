package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 营销方案表
    */
@Data
@Builder
public class CouponActivity {
    private Integer id;

    /**
    * 方案编号
    */
    private String activityNo;

    /**
    * 方案名称
    */
    private String activityName;

    /**
    * 活动开始时间
    */
    private Date enableTime;

    /**
    * 过期时间
    */
    private Date expireTime;

    /**
    * 优惠形式
    */
    private Byte activityType;

    /**
    * 领券规则
    */
    private String couponRule;

    /**
    * 活动描述
    */
    private String activityDesc;

    /**
    * 领券次数
    */
    private Byte getTimes;

    /**
    * 发送次数
    */
    private Byte sendTimes;

    private Date createTime;

    private Date updateTime;

    /**
    * 最后变更人id
    */
    private Integer operatorId;

    /**
    * 0冻结1正常
    */
    private Byte status;
}