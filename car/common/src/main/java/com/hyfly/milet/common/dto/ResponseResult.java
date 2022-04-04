package com.hyfly.milet.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseResult<T> implements Serializable {

    private Integer code = 200;
    private String msg;
    private T data;
}
