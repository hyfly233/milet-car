package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmsSendPhone {
    private Integer id;

    /**
    * 文案模板template_id
    */
    private String smsTemplateId;

    /**
    * 消息类型（1：营销；2：通知）
    */
    private Boolean smsType;

    /**
    * 发送类型（1：单人发送；2：批量发送）
    */
    private Boolean sendType;

    /**
    * 单人发送手机号
    */
    private String phoneNumber;

    /**
    * 批量发送文件名
    */
    private String phoneFile;

    /**
    * 1:乘客；2：司机
    */
    private Integer sendPeople;

    /**
    * 操作者
    */
    private Integer operatorUser;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}