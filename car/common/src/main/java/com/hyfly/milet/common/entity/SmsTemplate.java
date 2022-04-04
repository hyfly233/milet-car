package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmsTemplate {
    private Integer id;

    /**
    * 短信模板ID
    */
    private String templateId;

    private String templateName;

    /**
    * 模板内容
    */
    private String content;

    private Date createTime;

    private Date updateTime;

    /**
    * 模板类型（1：营销；2：通知；3：订单）
    */
    private Boolean templateType;
}