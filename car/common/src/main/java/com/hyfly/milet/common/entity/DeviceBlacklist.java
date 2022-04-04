package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 设备黑名单
    */
@Data
@Builder
public class DeviceBlacklist {
    private Integer id;

    /**
    * 1 android 2 ios3 other
    */
    private String deviceType;

    /**
    * 手机设备串码
    */
    private String deviceCode;

    /**
    * 最后一次登录时间
    */
    private Date lastLoginTime;

    /**
    * 1 解禁，0 未解禁
    */
    private Byte isRelease;

    /**
    * 欠款手机号
    */
    private String phones;

    /**
    * 备注
    */
    private String memo;

    /**
    * create
    */
    private Date createTime;

    /**
    * update
    */
    private Date updateTime;
}