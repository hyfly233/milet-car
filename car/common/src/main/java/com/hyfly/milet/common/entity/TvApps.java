package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TvApps {
    private Integer id;

    /**
    * 应用名称
    */
    private String appName;

    /**
    * 版本号
    */
    private Integer versionCode;

    /**
    * 开始更新时间
    */
    private Date startTime;

    /**
    * 应用包下载链接
    */
    private String downLoadUrl;

    /**
    * 包名
    */
    private String packageName;

    /**
    * 应用图标
    */
    private String icoUrl;

    /**
    * 应用状态 1启用 0停用
    */
    private Integer useStatus;

    /**
    * 应用位置
    */
    private Integer position;

    /**
    * 是否删除 1是 0否
    */
    private Integer isDel;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 创建人id
    */
    private Integer operatorId;
}