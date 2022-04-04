package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TvVersionUpdate {
    /**
    * ID
    */
    private Integer id;

    /**
    * TV平台版本名称
    */
    private String name;

    /**
    * tvVersionCode
    */
    private Integer tvVersionCode;

    /**
    * 版本号
    */
    private String tvVersion;

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
    * 安装包URL
    */
    private String downloadUrl;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 创建人id
    */
    private Integer operatorId;

    /**
    * 启用停用状态，0：停用，1：启用
    */
    private Byte useStatus;

    /**
    * 更新时间
    */
    private Date updateTime;
}