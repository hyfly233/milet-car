package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 网约车平台公司服务机构
    */
@Data
@Builder
public class BaseInfoCompanyService {
    private Integer id;

    /**
    * 服务机构名称
    */
    private String serviceName;

    /**
    * 服务机构代码
    */
    private String serviceNo;

    /**
    * 服务机构地址
    */
    private String detailAddress;

    /**
    * 服务机构负责人姓名
    */
    private String responsibleName;

    /**
    * 负责人联系电话
    */
    private String responsiblePhone;

    /**
    * 服务机构管理人姓名
    */
    private String managerName;

    /**
    * 管理人联系电话
    */
    private String managerPhone;

    /**
    * 服务机构紧急联系电话
    */
    private String contactPhone;

    /**
    * 行政文书送达邮寄地址
    */
    private String mailAddress;

    /**
    * 服务机构设立日期
    */
    private Date createDate;

    /**
    * 状态
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