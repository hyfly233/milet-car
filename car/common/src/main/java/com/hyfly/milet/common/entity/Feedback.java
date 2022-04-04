package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户反馈记录表
    */
@Data
@Builder
public class Feedback {
    private Integer id;

    private Integer userId;

    private String userName;

    private String phone;

    /**
    * 端
1:乘客
2,司机
3,车机
4,大屏
    */
    private String terminal;

    /**
    * 问题类型
    */
    private String category;

    /**
    * 反馈内容 
    */
    private String content;

    private Date createTime;

    private Date updateTime;
}