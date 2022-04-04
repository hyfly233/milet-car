package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmsSendApp {
    private Integer id;

    /**
    * 消息标题名称
    */
    private String name;

    /**
    * 展示端（1：乘客；2：司机）
    */
    private Byte showType;

    /**
    * 消息类型（1：营销；2：通知）
    */
    private Byte smsType;

    /**
    * 人群id
    */
    private Byte peopleTagId;

    /**
    * 消息图片
    */
    private String smsImage;

    /**
    * 消息文案id
    */
    private Integer appTemplateId;

    /**
    * 链接地址
    */
    private String smsUrl;

    /**
    * 生效时间
    */
    private Date startTime;

    /**
    * 推送状态（0：未推送；1：已推送）
    */
    private Boolean sendStatus;

    /**
    * 启用状态
    */
    private Boolean status;

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
    private Date updateTima;
}