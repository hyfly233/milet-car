package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganizationInfo {
    /**
    * 机构信息id
    */
    private Integer id;

    /**
    * 服务机构名称
    */
    private String organizationName;

    /**
    * 服务机构代码
    */
    private String organizationCode;

    /**
    * 行政区划分代码
    */
    private String administrativeDivisionCode;

    /**
    * 服务机构地址
    */
    private String organizationAddress;

    /**
    * 负责人姓名
    */
    private String dutyName;

    /**
    * 负责人手机号
    */
    private String dutyPhone;

    /**
    * 管理员姓名
    */
    private String adminName;

    /**
    * 管理员电话
    */
    private String adminPhone;

    /**
    * 服务机构总联系电话
    */
    private String organizationHeadPhone;
}