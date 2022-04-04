package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 通话记录上传记录表

    */
@Data
@Builder
public class SecretVoiceRecords {
    private Integer id;

    private String callId;

    /**
    * 对应的三元组的绑定关系ID
    */
    private String subsId;

    /**
    * 呼叫时间
    */
    private Date callTime;

    /**
    * 是否下载文件0：未下载  1：已下载
    */
    private Integer flag;

    /**
    * 文件下载地址
    */
    private String ossDownloadUrl;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}