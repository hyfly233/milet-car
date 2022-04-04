package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ads {
    private Integer id;

    /**
    * 视频/图片地址
    */
    private String downLoadUrl;

    /**
    * 链接地址
    */
    private String linkUrl;

    /**
    * 视频图片
    */
    private String videoImg;

    /**
    * 广告位id
    */
    private Integer positionId;

    /**
    * 开始时间
    */
    private Date startTime;

    /**
    * 结束时间
    */
    private Date endTime;

    /**
    * 展示城市
    */
    private String city;

    /**
    * 广告名称
    */
    private String name;

    /**
    * 平台
    */
    private String platform;

    /**
    * 1：视频；2：图片
    */
    private Boolean type;

    /**
    * 人群模板id
    */
    private Byte peopleTagId;

    /**
    * 1启用0停用
    */
    private Integer status;

    /**
    * 操作人
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