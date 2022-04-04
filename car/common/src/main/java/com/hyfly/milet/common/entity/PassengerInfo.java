package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerInfo {
    private Integer id;

    /**
    * 电话
    */
    private String phone;

    /**
    * 学历
    */
    private String educatioan;

    /**
    * 生日
    */
    private Date birthday;

    /**
    * 乘客名称
    */
    private String passengerName;

    /**
    * 注册时间
    */
    private Date registerTime;

    /**
    * 余额
    */
    private BigDecimal balance;

    /**
    * 0：女，1：男
    */
    private Byte gender;

    /**
    * 头像
    */
    private String headImg;

    /**
    * 用户类型，1：个人用户，2：企业用户
    */
    private Byte passengerType;

    /**
    * 会员等级
    */
    private Byte userLevel;

    /**
    * 注册渠道 1 安卓 2 ios
    */
    private Short registerType;

    /**
    * 最后一次登录时间
    */
    private Date lastLoginTime;

    /**
    * 上次登陆方式:1,验证码,2密码
    */
    private Byte lastLoginMethod;

    /**
    * 上次登录大屏时间
    */
    private Date lastLoginScreenTime;

    /**
    * 上次登录大屏方式
    */
    private String lastLoginScreenMethod;

    /**
    * 最后一次下单时间
    */
    private Date lastOrderTime;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}