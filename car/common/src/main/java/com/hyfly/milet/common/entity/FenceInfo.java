package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 围栏管理
    */
@Data
@Builder
public class FenceInfo {
    private Integer id;

    /**
    * 高德ID
    */
    private String gid;

    /**
    * 城市编码
    */
    private String cityCode;

    /**
    * 围栏名称
    */
    private String fenceName;

    /**
    * 生效开始时间
    */
    private Date validStartTime;

    /**
    * 生效结束时间
    */
    private Date validEndTime;

    /**
    * 是否禁用 0未禁用 1已禁用
    */
    private Boolean isDeny;

    /**
    * 是否删除 0未删除 1已删除
    */
    private Boolean isDelete;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}