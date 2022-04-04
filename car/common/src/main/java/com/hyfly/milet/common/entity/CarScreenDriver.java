package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarScreenDriver {
    /**
    * id
    */
    private Integer id;

    /**
    * 司机id
    */
    private Integer driverId;

    /**
    * 汽车屏幕唯一码
    */
    private String carScreenCode;

    /**
    * 登录时间
    */
    private Date loginTime;

    /**
    * 登出时间
    */
    private Date logoutTime;

    /**
    * 登录状态：1：登录，2：退出登录
    */
    private Integer loginStatus;

    /**
    * 修复登出时间
    */
    private Date repairTime;

    private Date createTime;

    private Date updateTime;
}