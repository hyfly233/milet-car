package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 乘客端,司机端，车机端app更新
    */
@Data
@Builder
public class AppVersionUpdate {
    /**
    * id
    */
    private Integer id;

    /**
    * 上线系统 平台 1: ios, 2: android
    */
    private Short platform;

    /**
    * 通知类型（1:强制 2:非强制）
    */
    private Short noticeType;

    /**
    * 升级提示（不超过30个字）
    */
    private String prompt;

    /**
    * 备注
    */
    private String note;

    /**
    * 生效开始时间	
    */
    private Date startTime;

    /**
    * 生效结束时间
    */
    private Date endTime;

    /**
    * 安装包url
    */
    private String downloadUrl;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 创建人
    */
    private Integer operatorId;

    /**
    * 1:乘客端，2：司机端  3:车机端
    */
    private Integer appType;

    /**
    * app版本号
    */
    private String appVersion;

    /**
    * 启用停用状态，0：停用，1：启用
    */
    private Integer useStatus;

    /**
    * 版本号code
    */
    private Integer versionCode;

    /**
    * 更新时间
    */
    private Date updateTime;
}