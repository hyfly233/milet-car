package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Sms {
    private Integer id;

    /**
    * 乘客手机号
    */
    private String passengerPhoneNumber;

    /**
    * 短信内容
    */
    private String smsContent;

    /**
    * 发送时间
    */
    private Date sendTime;

    /**
    * 操作人
    */
    private String operator;

    /**
    * 发送状态 0:失败  1: 成功
    */
    private Boolean sendFlag;

    /**
    * 发送失败次数
    */
    private Boolean sendNumber;

    private Date createTime;

    private Date updateTime;
}