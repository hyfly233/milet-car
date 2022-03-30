package com.hyfly.milet.common.dto;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;
}
