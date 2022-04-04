package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

/**
    * 系统配置杂项
    */
@Data
@Builder
public class SysConfig {
    private Integer id;

    /**
    * 配置项
    */
    private String confKey;

    /**
    * 配置值
    */
    private String confVal;

    /**
    * 配置名称
    */
    private String confName;
}