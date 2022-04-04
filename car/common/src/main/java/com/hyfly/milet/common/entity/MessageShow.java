package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageShow {
    private Integer id;

    /**
    * 标题
    */
    private String title;

    /**
    * 消息体
    */
    private String content;

    /**
    * 乘客、司机id,大屏设备号
    */
    private String yid;

    /**
    * 发送端（1：乘客；2：司机；4：大屏）
    */
    private Byte acceptIdentity;

    /**
    * 发送时间
    */
    private Date sendTime;

    /**
    * 推送类型 （1：营销通知，2：系统通知，3：订单通知，4：支付通知）
    */
    private Byte pushType;

    /**
    * 是否显示（0：不显示，1：显示）
    */
    private Boolean status;

    /**
    * 是否已读（0：未读，1：已读）
    */
    private Boolean isRead;

    /**
    * 订单号
    */
    private Integer orderId;

    /**
    * 推送任务id
    */
    private Integer smsSendAppId;

    private Date createTime;
}