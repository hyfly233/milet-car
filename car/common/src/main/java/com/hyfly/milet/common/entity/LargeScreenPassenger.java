package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 乘客大屏登录状态
    */
@Data
@Builder
public class LargeScreenPassenger {
    private Integer id;

    /**
    * 乘客id
    */
    private Integer passengerInfoId;

    /**
    * 设备号
    */
    private String deviceCode;

    private Date loginTime;

    private Date logoutTime;

    /**
    * 登录状态：1：登录，2：退出登录
    */
    private Integer loginStatus;

    private Date repairTime;
}