package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 消息系统列表
    */
@Data
@Builder
public class PushLoopMessage {
    private Long id;

    /**
    * 1:乘客，2：司机，3：车机，4：大屏
    */
    private Byte acceptIdentity;

    /**
    * 接受方id
    */
    private String acceptId;

    /**
    * 消息类型，看枚举定义
    */
    private Short messageType;

    /**
    * 消息体
    */
    private String messageBody;

    /**
    * 0:未读，1：已读
    */
    private Byte readFlag;

    /**
    * 发送方id
    */
    private String sendId;

    /**
    * 发送者身份类别
    */
    private Integer sendIdentity;

    /**
    * 消息失效时间
    */
    private Date expireTime;

    /**
    * 消息创建时间
    */
    private Date createTime;

    private Date updateTime;
}