package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysUser {
    private Integer id;

    private String username;

    private String password;

    /**
    * 密码的盐
    */
    private String salt;

    private String phone;

    private Boolean isDeleted;

    private Boolean status;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后登录时间
    */
    private Date lastLoginTime;

    /**
    * 最后修改人ID
    */
    private Integer modifyId;

    private Date lastUpdatePasswordTime;
}