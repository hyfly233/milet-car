package com.hyfly.milet.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hyfly
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PassengerUserBase implements Serializable {

    /**
     * 允许登陆
     */
    public static final String LOCK_FLAG_PASS = "1";
    /**
     * 不允许登陆
     */
    public static final String LOCK_FLAG_UNPASS = "0";

    /**
     * 性别  未知
     */
    public static final String GENDER_UNKNOWN = "0";
    /**
     * 性别  男
     */
    public static final String GENDER_BOY = "1";
    /**
     * 性别  女
     */
    public static final String GENDER_GIRL = "2";

    /**
     * 主键
     */
    private Long id;

    /**
     * 登陆名（默认为手机号）
     */
    private String loginName;

    /**
     * 密码（不一定存在）
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别 0：未知 1：男 2：女
     */
    private String gender;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 注册成功的时间
     */
    private Date registerDate;

    /**
     * 允许登陆标识 0：不允许 1：允许
     */
    private String lockFlag;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 更新人ID
     */
    private Long updateUserId;

    private static final long serialVersionUID = 1L;

}