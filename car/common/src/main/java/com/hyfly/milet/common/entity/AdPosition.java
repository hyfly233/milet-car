package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdPosition {
    /**
    * 广告位id
    */
    private Integer id;

    /**
    * 广告位名称
    */
    private String positionName;

    /**
    * 广告位描述
    */
    private String positionDesc;

    /**
    * 广告位类型（1：客户端；2：大屏端）
    */
    private Boolean positionType;

    /**
    * 状态（0：暂停；1：开启）
    */
    private Boolean status;

    /**
    * 广告上限
    */
    private Byte mostCount;

    /**
    * 内容类型（1：视频；2：图片）
    */
    private Boolean contentType;

    /**
    * 操作者
    */
    private Integer operatorUser;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}