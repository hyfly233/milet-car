package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PushAppMessage {
    private Integer id;

    /**
    * 乘客、司机id,大屏设备号
    */
    private String yid;

    /**
    * 接收端（1：乘客；2：司机；4：大屏）
    */
    private Boolean acceptIdentity;

    /**
    * 标题
    */
    private String title;

    /**
    * 消息内容
    */
    private String content;

    /**
    * 发送时间
    */
    private Date sendTime;

    /**
    * 是否显示（0：不显示，1：显示）
    */
    private Boolean status;

    /**
    * 推送类型  （1：营销通知，2：系统通知，3：订单通知，4：支付通知）
    */
    private Byte pushType;

    /**
    * 推送任务id
    */
    private Integer smsSendAppId;

    /**
    * 创建时间
    */
    private Date createTime;
}