package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 渠道管理表
    */
@Data
@Builder
public class Channel {
    private Integer id;

    /**
    * 渠道名称
    */
    private String channelName;

    /**
    * 渠道开启暂停状态 1开启 0暂停
    */
    private Integer channelStatus;

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