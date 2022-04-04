package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmsAppTemplate {
    private Integer id;

    /**
    * 模板名称
    */
    private String templateName;

    /**
    * 模板类型（1：营销；2：通知）
    */
    private Byte templateType;

    /**
    * 模板内容
    */
    private String content;

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