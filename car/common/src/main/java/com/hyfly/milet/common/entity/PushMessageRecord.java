package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 消息推送记录
    */
@Data
@Builder
public class PushMessageRecord {
    private Integer id;

    /**
    * 系统类型
    */
    private String source;

    /**
    * 接收通知的设备token
    */
    private String jpushId;

    /**
    * 消息类型
    */
    private Integer messageType;

    /**
    * 消息内容
    */
    private String messageBody;

    /**
    * 发送结果1：成功，0：失败
    */
    private Integer sendResult;

    /**
    * 发送方id
    */
    private String sendId;

    /**
    * 发送者身份类别
    */
    private Integer sendIdentity;

    /**
    * 创建时间
    */
    private Date createTime;

    private Date updateTime;
}