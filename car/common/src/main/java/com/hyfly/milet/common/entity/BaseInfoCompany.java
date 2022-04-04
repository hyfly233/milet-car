package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 网约车平台公司基本信息
    */
@Data
@Builder
public class BaseInfoCompany {
    private Integer id;

    /**
    * 公司名称
    */
    private String companyName;

    /**
    * 统一社会信用代码
    */
    private String identifier;

    /**
    * 经营范围
    */
    private String businessScope;

    /**
    * 通信地址
    */
    private String contactAddress;

    /**
    * 经营业户经济类型
    */
    private String economicType;

    /**
    * 注册资本
    */
    private String regCapital;

    /**
    * 法人代表姓名
    */
    private String legalName;

    /**
    * 法人代表身份证号
    */
    private String legalId;

    /**
    * 法人代表电话
    */
    private String legalPhone;

    /**
    * 法人代表身份证扫描件文件编号
    */
    private String legalPhoto;

    /**
    * 状态0有效，1失效
    */
    private Integer state;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}