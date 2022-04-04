package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PhoneMessage {
    private Integer id;

    /**
    * 电话
    */
    private String phoneNumber;

    /**
    * 消息体
    */
    private String smsContent;

    /**
    * 发送时间
    */
    private Date sendTime;

    /**
    * 推送类型 （1：营销,2:通知）
    */
    private Boolean pushType;

    /**
    * 发送状态（0：失败；1：成功）
    */
    private Boolean status;

    /**
    * 操作者
    */
    private String operator;

    /**
    * 创建时间
    */
    private Date createTime;
}