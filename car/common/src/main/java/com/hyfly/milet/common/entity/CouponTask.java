package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 优惠券发送任务表
    */
@Data
@Builder
public class CouponTask {
    private Integer id;

    /**
    * 优惠券ID
    */
    private Integer couponId;

    /**
    * 优惠券名称
    */
    private String couponName;

    /**
    * 发放数量
    */
    private Short number;

    /**
    * 任务标签,用于区分不同批次
    */
    private String taskTag;

    /**
    * 人群模板ID
    */
    private Integer peopleTagId;

    /**
    * 任务目标,最多100个手机号
    */
    private String taskTarget;

    /**
    * app文案模板ID
    */
    private Integer appTplId;

    /**
    * 短信文案模板ID
    */
    private Integer smsTplId;

    private Date createTime;

    private Date updateTime;

    /**
    * 操作人id
    */
    private Integer operatorId;

    /**
    * 任务状态:0未开始1进行中2完成
    */
    private Byte taskStatus;

    private Date startTime;

    /**
    * 是否终止:0否,1是
    */
    private Byte isCancel;

    /**
    * 计划发送时间
    */
    private Date planTime;
}